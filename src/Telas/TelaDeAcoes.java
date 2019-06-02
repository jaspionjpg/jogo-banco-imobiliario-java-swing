package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controle.Utils;
import Modals.Empreendimento;
import Modals.Jogador;

public class TelaDeAcoes extends JPanel implements ActionListener{
	private static final long serialVersionUID = -7712775255861544457L;

	Random r = new Random();
	int alt;
	int lar;
	int larTela;
	int altTela;
	
	TelaPartida tabuleiro;
	List<Empreendimento> empreendimentos;
	List<Jogador> jogadores;
	int vezJogador = 0;
	
	JLabel tituloJogadorDaVez;
	JLabel jogadorDaVez;

	JButton jogarDados;
	
	JButton comprarEmpreendimento;
	JButton venderEmpreendimento;
	JButton colocarCasa;
	
	JButton sair;
	JButton salvar;
	
	public TelaDeAcoes(TelaPartida tabuleiro, List<Jogador> jogadores, List<Empreendimento> empreendimentos, int lar, int alt, int larTela) {
		this.tabuleiro = tabuleiro;
		this.jogadores = jogadores;
		this.empreendimentos = empreendimentos;
		
		this.alt = alt;
		this.lar = lar;
		this.larTela = larTela;
		
		setLayout(null);
		setBounds((int) (larTela*0.8), (int) (alt*0.5), lar, (int) (alt*0.5));
		setOpaque(true);
		setBackground(Color.GREEN);
	
		setComponents();
		
		setVisible(true);
	}

	private void setComponents() {
		tituloJogadorDaVez = new JLabel("É vez do ");
		tituloJogadorDaVez.setBounds((lar-150)/2, 1, 100, 40);
		add(tituloJogadorDaVez);
		
		jogadorDaVez = new JLabel(jogadores.get(vezJogador).getNome());
		jogadorDaVez.setFont(new Font("Arial", Font.BOLD, 20));
		jogadorDaVez.setForeground(jogadores.get(vezJogador).getCor());
		jogadorDaVez.setBounds((lar-30)/2, 0, 100, 40);
		add(jogadorDaVez);
		
		jogarDados = new JButton("Jogar Dados");
		jogarDados.setBounds((lar-200)/2,40,200,50);
		jogarDados.addActionListener(this);
		jogarDados.setFocusable(false);
		add(jogarDados);
		
		sair = new JButton("Sair");
		sair.setBounds((lar-200)/2+100,300,100,50);
		sair.addActionListener(this);
		sair.setFocusable(false);
		add(sair);
		
		salvar = new JButton("Salvar");
		salvar.setBounds((lar-200)/2,300,100,50);
		salvar.addActionListener(this);
		salvar.setFocusable(false);
		add(salvar);
	}

	public void jogarDados(int i){
		int l = r.nextInt(6)+1;
		int w = r.nextInt(6)+1;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jogarDados){
			
		} else if(e.getSource() == sair){
			System.exit(1);
		} else if(e.getSource() == salvar){
			Utils.salvarEstado(tabuleiro);
		} 
	}

}
