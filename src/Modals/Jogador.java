package Modals;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Jogador extends JLabel{
	private static final long serialVersionUID = 5148080879991679462L;
	
	String nome;
	Integer dinheiro;
	List<Empreendimento> empreendimentos; 
	List<CartaoSorte> cartaosSorte; 
	Color cor;
	
	int posicaoTabuleiro = 0;
	
	public Jogador(String nome, Color cor) {
		this.nome = nome;
		this.cor = cor;
		
		setSize(64,64);
		if(Color.YELLOW.equals(cor)){
			setIcon(new ImageIcon(getClass().getResource("../Imagens/Diversas/amarelo.png")));
		} else if(Color.WHITE.equals(cor)){
			setIcon(new ImageIcon(getClass().getResource("../Imagens/Diversas/amarelo.png")));
		} else if(Color.BLUE.equals(cor)){
			setIcon(new ImageIcon(getClass().getResource("../Imagens/Diversas/azel.png")));
		} else if(Color.BLACK.equals(cor)){
			setIcon(new ImageIcon(getClass().getResource("../Imagens/Diversas/preto.png")));
		} else if(Color.PINK.equals(cor)){
			setIcon(new ImageIcon(getClass().getResource("../Imagens/Diversas/amarelo.png")));
		} else if(Color.lightGray.equals(cor)){
			setIcon(new ImageIcon(getClass().getResource("../Imagens/Diversas/rocho.png")));
		} else if(Color.GREEN.equals(cor)){
			setIcon(new ImageIcon(getClass().getResource("../Imagens/Diversas/verde.png")));
		} else if(Color.RED.equals(cor)){
			setIcon(new ImageIcon(getClass().getResource("../Imagens/Diversas/vermelho.png")));
		} 
		
		dinheiro = 2558000;
		empreendimentos = new ArrayList<Empreendimento>();
		cartaosSorte = new ArrayList<CartaoSorte>();
	}

	public String getNome() {
		return nome;
	}

	public Integer getDinheiro() {
		return dinheiro;
	}

	public List<Empreendimento> getEmpreendimentos() {
		return empreendimentos;
	}

	public List<CartaoSorte> getCartaosSorte() {
		return cartaosSorte;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDinheiro(Integer dinheiro) {
		this.dinheiro = dinheiro;
	}

	public void setEmpreendimentos(List<Empreendimento> empreendimentos) {
		this.empreendimentos = empreendimentos;
	}

	public void setCartaosSorte(List<CartaoSorte> cartaosSorte) {
		this.cartaosSorte = cartaosSorte;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	public int getPosicaoTabuleiro() {
		return posicaoTabuleiro;
	}

	public void setPosicaoTabuleiro(int posicaoTabuleiro) {
		this.posicaoTabuleiro = posicaoTabuleiro;
	}
}
