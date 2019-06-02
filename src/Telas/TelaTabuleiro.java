package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Modals.Empreendimento;
import Modals.Jogador;

public class TelaTabuleiro extends JPanel implements MouseMotionListener{
	private static final long serialVersionUID = -8762445833431682890L;
	int lar;
	int alt;
	List<Empreendimento> empreendimentos;
	List<Jogador> jogadores;
	
	public TelaTabuleiro(int lar, int alt, List<Empreendimento> empreendimentos, List<Jogador> jogadores) {
		this.alt = alt;
		this.lar = lar;
		this.empreendimentos = empreendimentos;
		this.jogadores = jogadores;
		setLayout(null);
		setOpaque(true);
		setBackground(Color.RED);
		setBounds(0, 0, 1601, 1601);
		addMouseMotionListener(this);
		setImagemCentral();
		colocaEmpreendimentosNaTela();		
		setJogadores();
	}

	private void setJogadores() {
		for(int i = 0 ; i < jogadores.size(); i++){
			moveJogador(i);
			add(jogadores.get(i),1);
		}
	}

	public void moveJogador(int i) {
		int x = i < 4 ? i * 20 : (i - 4) * 20;
		int y = i < 4 ? 20 : 50;
		
		jogadores.get(i).setLocation((int) (x + empreendimentos.get(jogadores.get(i).getPosicaoTabuleiro()).getLocation().getX()), (int) (y+ empreendimentos.get(jogadores.get(i).getPosicaoTabuleiro()).getLocation().getY()));
	}

	public void setImagemCentral() {
		JLabel imagem = new JLabel("Banco Imobiliario"){
			private static final long serialVersionUID = 1L;

			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D)g;
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
										RenderingHints.VALUE_ANTIALIAS_ON);
				AffineTransform aT = g2.getTransform();
				double x = getWidth()/2.0;
				double y = getHeight()/2.0;
				aT.rotate(Math.toRadians(45), x, y);
				g2.setTransform(aT);
				super.paintComponent(g);
			}
		};
		imagem.setBounds(100,100,1500,1500);
		imagem.setFont(new Font("Arial", Font.BOLD, 166));
		add(imagem);
	}

	private void colocaEmpreendimentosNaTela() {
		for(Empreendimento empreendimento : empreendimentos){
			if(empreendimento.getCodEmpreendimento() == 0 || empreendimento.getCodEmpreendimento() % 9 == 0 ){
				if(empreendimento.getCodEmpreendimento() == 0){
					empreendimento.setBounds(0,0,200,200);
					empreendimento.setComponents();
					add(empreendimento);
				} else if(empreendimento.getCodEmpreendimento() == 9){
					empreendimento.setBounds(9* 150+50,0,200,200);
					empreendimento.setComponents();
					add(empreendimento);
				} else if(empreendimento.getCodEmpreendimento() == 18){
					empreendimento.setBounds(9 * 150+50, 9 * 150+50, 200, 200);
					empreendimento.setComponents();
					add(empreendimento);
				} else if(empreendimento.getCodEmpreendimento() == 27){
					empreendimento.setBounds(0, 9 * 150+50, 200, 200);
					empreendimento.setComponents();
					add(empreendimento);
				}
			} else {
				if(empreendimento.getCodEmpreendimento() <9){
					empreendimento.setBounds(empreendimento.getCodEmpreendimento()* 150+50,0,150,200);
					empreendimento.setComponents();
					add(empreendimento);
				} else if(empreendimento.getCodEmpreendimento() <18){
					empreendimento.setBounds(9 * 150+50,(empreendimento.getCodEmpreendimento()-9)* 150+50,200,150);
					empreendimento.setComponents();
					add(empreendimento);
				} else if(empreendimento.getCodEmpreendimento() <27){
					empreendimento.setBounds((empreendimento.getCodEmpreendimento()-18)* 150+50 ,9 * 150+50,150,200);
					empreendimento.setComponents();
					add(empreendimento);
				} else if(empreendimento.getCodEmpreendimento() <36){
					empreendimento.setBounds(0,(empreendimento.getCodEmpreendimento()-27)* 150+50 ,200,150);
					empreendimento.setComponents();
					add(empreendimento);
				}
			}
			
		}
	}

	int x = 0;
	int y = 0;
	@Override
	public void mouseDragged(MouseEvent e) {
		if(x < e.getX() && y < e.getY()){
			if(getLocation().getX() < -4 && getLocation().getY() < -4)
			this.setLocation((int) getLocation().getX()+5, (int) getLocation().getY()+5);
		} else if(x > e.getX() && y > e.getY()){
			if(getLocation().getX() > (1601 - lar)*-1 && getLocation().getY() > (1601 - alt)*-1)
			setLocation((int) getLocation().getX()-5, (int) getLocation().getY()-5);
		} else if(x < e.getX() && y > e.getY()){
			if(getLocation().getX() < -4 && getLocation().getY() > (1601 - alt)*-1)
			this.setLocation((int) getLocation().getX()+5, (int) getLocation().getY()-5);
		} else if(x > e.getX() && y < e.getY()){
			if(getLocation().getX() > (1601 - lar)*-1 && getLocation().getY() < -4)
			setLocation((int) getLocation().getX()-5, (int) getLocation().getY()+5);
		} else 
		
		if(x < e.getX()){
			if(getLocation().getX() < -4)
			this.setLocation((int) getLocation().getX()+5, (int) getLocation().getY());
		} else if(x > e.getX()){
			if(getLocation().getX() > (1601 - lar)*-1)
			setLocation((int) getLocation().getX()-5, (int) getLocation().getY());
		} else if(y < e.getY()){
			if(getLocation().getY() < -4)
			setLocation((int) getLocation().getX(), (int) getLocation().getY()+5);
		} else if(y > e.getY()){
			if(getLocation().getY() > (1601 - alt)*-1)
			setLocation((int) getLocation().getX(), (int) getLocation().getY()-5);
		}
		
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}
