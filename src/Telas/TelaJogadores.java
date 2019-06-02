package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Modals.Jogador;

public class TelaJogadores extends JPanel implements MouseListener{
	private static final long serialVersionUID = -7742105334575302706L;
	
	int lar;
	int alt;
	int larTela;
	
	JLabel tituloJogadores;
	
	List<Jogador> jogadores;
	List<JLabel> nomeJogadores;
	List<JLabel> dinheiroJogadores;
	
	JPanel empreendimentosJogador;
	
	JFrame tela;
	
	public TelaJogadores(int lar, int alt, int larTela, List<Jogador> jogadores, JFrame tela) {
		this.alt = alt;
		this.lar = lar;
		this.larTela = larTela;
		this.jogadores = jogadores;
		this.tela = tela;
		
		inicializaComponents();
		
		setLayout(null);
		setBounds((int) (larTela*0.8), 0, lar, (int) (alt*0.5));
		setOpaque(true);
		setBackground(Color.BLUE);
	}

	private void inicializaComponents() {
		tituloJogadores = new JLabel("Jogadores");
		tituloJogadores.setBounds(100, 20, 100, 30);
		tituloJogadores.setFont(new Font("Arial", Font.BOLD, 17));
		add(tituloJogadores);
		
		empreendimentosJogador = new JPanel();
		tela.add(empreendimentosJogador);
		
		nomeJogadores = new ArrayList<JLabel>();
		dinheiroJogadores = new ArrayList<JLabel>();
		
		for(int i = 0 ; i < jogadores.size(); i++){
			JLabel nomeJogador = new JLabel();
			nomeJogador.setText(jogadores.get(i).getNome());
			nomeJogador.setBounds(40, 70 + (i * 35), 100, 30);
			nomeJogador.setFont(new Font("Arial", Font.BOLD, 17));
			nomeJogador.setForeground(jogadores.get(i).getCor());
			nomeJogador.addMouseListener(this);
			
			JLabel dinheiroJogador = new JLabel();
			dinheiroJogador.setText("R$: "+jogadores.get(i).getDinheiro());
			dinheiroJogador.setBounds(140, 70 + (i * 35), 100, 30);
			dinheiroJogador.setFont(new Font("Arial", Font.BOLD, 17));
			dinheiroJogador.setForeground(jogadores.get(i).getCor());
			dinheiroJogador.addMouseListener(this);
			
			nomeJogadores.add(nomeJogador);
			dinheiroJogadores.add(dinheiroJogador);
			
			add(nomeJogadores.get(i));
			add(dinheiroJogadores.get(i));
		}
	}
	
	public void atualizaMonetarios(){
		for(int i = 0 ; i < jogadores.size(); i++){
			dinheiroJogadores.get(i).setText("R$: "+jogadores.get(i).getDinheiro());;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		for(int i = 0; i < jogadores.size(); i++){
			if(e.getSource() == nomeJogadores.get(i) || e.getSource() == dinheiroJogadores.get(i)){
				empreendimentosJogador.setBounds((int) (larTela*0.8)+38-200,nomeJogadores.get(i).getY(), 200,300);
				empreendimentosJogador.setOpaque(true);
				empreendimentosJogador.setBackground(Color.GREEN);
				empreendimentosJogador.setLayout(null);
				
				if(jogadores.get(i).getEmpreendimentos().size() == 0){
					JLabel naoaempreendimentos = new JLabel("Não Existe Nenhum Empreendimento");
					naoaempreendimentos.setBounds(0,0,200,80);
					empreendimentosJogador.add(naoaempreendimentos);
				} else {
					for(int k = 0 ; k < jogadores.get(i).getEmpreendimentos().size(); k++){
						JLabel naoaempreendimentos = new JLabel(jogadores.get(i).getEmpreendimentos().get(k).getNome());
						naoaempreendimentos.setBounds(0,0,200,80);
						empreendimentosJogador.add(naoaempreendimentos);
					}
				}
				
				empreendimentosJogador.setVisible(true);
				break;
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		empreendimentosJogador.setVisible(false);
		empreendimentosJogador.removeAll();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}