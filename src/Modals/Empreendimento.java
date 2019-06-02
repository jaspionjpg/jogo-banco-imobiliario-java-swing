package Modals;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Empreendimento extends JPanel {
	private static final long serialVersionUID = -506029527522472158L;
	
	JLabel nomeL;
	
	public void setComponents(){
		setOpaque(true);
		setBackground(Color.BLUE);
		setLayout(null);
		setBorder(BorderFactory.createLineBorder(Color.PINK));
		
		nomeL = new JLabel(nome);
		nomeL.setBounds(10,10,100,20);
		add(nomeL);
		
	}
	
	Integer codEmpreendimento;
	
	String nome;
	
	Integer tipoEmpreendimento;
	//0 = Ruas
	//1 = Ações
	//2 = Sorte ou revés
	//3 = Cadeia
	//4 = Recomeço
	
	Integer valorEmpreendimento;
	Integer valorHipoteca;
	
	Integer valorAluguel;
	Integer valorPorCasaAluguel;
	Integer valorPorCasaAColocar;
	
	Integer quantidadeCasas;
	
	ImageIcon imagem;
	Color cor;
	
	Jogador proprietario;

	public Integer getCodEmpreendimento() {
		return codEmpreendimento;
	}

	public String getNome() {
		return nome;
	}

	public Integer getTipoEmpreendimento() {
		return tipoEmpreendimento;
	}

	public Integer getValorEmpreendimento() {
		return valorEmpreendimento;
	}

	public Integer getValorHipoteca() {
		return valorHipoteca;
	}

	public Integer getValorAluguel() {
		return valorAluguel;
	}

	public Integer getValorPorCasaAluguel() {
		return valorPorCasaAluguel;
	}

	public Integer getValorPorCasaAColocar() {
		return valorPorCasaAColocar;
	}

	public Integer getQuantidadeCasas() {
		return quantidadeCasas;
	}

	public ImageIcon getImagem() {
		return imagem;
	}

	public Color getCor() {
		return cor;
	}

	public Jogador getProprietario() {
		return proprietario;
	}

	public void setCodEmpreendimento(Integer codEmpreendimento) {
		this.codEmpreendimento = codEmpreendimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipoEmpreendimento(Integer tipoEmpreendimento) {
		this.tipoEmpreendimento = tipoEmpreendimento;
	}

	public void setValorEmpreendimento(Integer valorEmpreendimento) {
		this.valorEmpreendimento = valorEmpreendimento;
	}

	public void setValorHipoteca(Integer valorHipoteca) {
		this.valorHipoteca = valorHipoteca;
	}

	public void setValorAluguel(Integer valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public void setValorPorCasaAluguel(Integer valorPorCasaAluguel) {
		this.valorPorCasaAluguel = valorPorCasaAluguel;
	}

	public void setValorPorCasaAColocar(Integer valorPorCasaAColocar) {
		this.valorPorCasaAColocar = valorPorCasaAColocar;
	}

	public void setQuantidadeCasas(Integer quantidadeCasas) {
		this.quantidadeCasas = quantidadeCasas;
	}

	public void setImagem(ImageIcon imagem) {
		this.imagem = imagem;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	public void setProprietario(Jogador proprietario) {
		this.proprietario = proprietario;
	}
}
