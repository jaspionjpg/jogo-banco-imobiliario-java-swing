package Telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Modals.Empreendimento;
import Modals.Jogador;

public class TelaPartida extends JFrame implements Runnable, KeyListener{
	private static final long serialVersionUID = 4973182061408321087L;
	List<Empreendimento> empreendimentos;
	int alt;
	int lar;
	TelaTabuleiro tt;
	TelaJogadores tj;
	TelaDeAcoes tda;
	List<Jogador> jogadores;
	
	public TelaPartida(List<Jogador> jogadores){
		this.jogadores = jogadores;
		inicializaComponents();
		setComponents();
		setVisible(true);
	}
	
	private void setComponents() {
		tt = new TelaTabuleiro((int) (lar*0.8),alt, empreendimentos, jogadores);
		addKeyListener(this);
		
		tj = new TelaJogadores((int) (lar*0.2)+1,alt, lar, jogadores, this);
		
		tda = new TelaDeAcoes(this, jogadores, empreendimentos, (int) (lar*0.2)+1,alt, lar);

		add(tda);
		add(tj);
		add(tt);
	}

	private void inicializaComponents() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setTitle("Banco Imobiliario");
		setLayout(null);
		
		Toolkit kit = Toolkit.getDefaultToolkit();  
		Dimension tamTela = kit.getScreenSize();  

		lar = tamTela.width;  
		alt = tamTela.height; 
		
		inicializaCampos();
	}

	private void inicializaCampos() {
		empreendimentos = new ArrayList<Empreendimento>();
		
		for(int i = 0; i < 40; i++ ){
			Empreendimento empreendimento = new Empreendimento();
			empreendimento.setCor(Color.RED);
			empreendimento.setImagem(new ImageIcon(""));
			empreendimento.setCodEmpreendimento(i);
			empreendimento.setNome("Beleleu");
			empreendimento.setProprietario(null);
			empreendimento.setQuantidadeCasas(0);
			empreendimento.setTipoEmpreendimento(0);
			empreendimento.setValorAluguel(100);
			empreendimento.setValorEmpreendimento(100000);
			empreendimento.setValorHipoteca(10000);
			empreendimento.setValorPorCasaAColocar(12000);
			empreendimento.setValorPorCasaAluguel(3000);
			
			empreendimentos.add(empreendimento);
		}
	}

	@Override
	public void run() {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == 38){
			if(tt.getLocation().getY() < -4)
				tt.setLocation((int) tt.getLocation().getX(), (int) tt.getLocation().getY()+5);
		} else if(e.getKeyCode() == 40){
			if(tt.getLocation().getY() > (1601 - alt)*-1)
				tt.setLocation((int) tt.getLocation().getX(), (int) tt.getLocation().getY()-5);
		} else if(e.getKeyCode() == 39){
			if(tt.getLocation().getX() > (1601 - lar)*-1)
				tt.setLocation((int) tt.getLocation().getX()-5, (int) tt.getLocation().getY());
		} else if(e.getKeyCode() == 37){
			if(tt.getLocation().getX() < -4)
				tt.setLocation((int) tt.getLocation().getX()+5, (int) tt.getLocation().getY());
		} else if (e.getKeyCode() == KeyEvent.VK_X){
			System.out.println("X");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}