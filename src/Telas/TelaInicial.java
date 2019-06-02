package Telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Modals.Jogador;

public class TelaInicial extends JFrame implements ActionListener{
	private static final long serialVersionUID = -7300611786813771705L;
	ImageIcon icon = new ImageIcon(getClass().getResource("../Imagens/Diversas/desabilitado.png"));
	ImageIcon icon2 = new ImageIcon(getClass().getResource("../Imagens/Diversas/habilitado.png"));


	public TelaInicial() {
		criarPartida(new ArrayList<>());
		//inicializaComponents();
	}

	JLabel nomesTitulo1;
	JLabel nomesTitulo2;
	JLabel nomesTitulo3;
	JLabel nomesTitulo4;
	JLabel nomesTitulo5;
	JLabel nomesTitulo6;
	JLabel nomesTitulo7;
	JLabel nomesTitulo8;
	
	JTextField nome1;
	JTextField nome2;
	JTextField nome3;
	JTextField nome4;
	JTextField nome5;
	JTextField nome6;
	JTextField nome7;
	JTextField nome8;
	
	JComboBox<String> cores1;
	JComboBox<String> cores2;
	JComboBox<String> cores3;
	JComboBox<String> cores4;
	JComboBox<String> cores5;
	JComboBox<String> cores6;
	JComboBox<String> cores7;
	JComboBox<String> cores8;
	
	JButton ativa1;
	JButton ativa2;
	JButton ativa3;
	JButton ativa4;
	JButton ativa5;
	JButton ativa6;
	JButton ativa7;
	JButton ativa8;
	
	JButton iniciar;
	
	private void inicializaComponents() {
		setTitle("Banco Imobiliario");
		setLayout(null);
		setSize(550,440);
		getContentPane().setBackground(Color.ORANGE);
		
		nomesTitulo1 = new JLabel(" 1 - Nome:");
		nomesTitulo1.setBounds(20,30,485,40);
		nomesTitulo1.setOpaque(true);
		nomesTitulo1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(nomesTitulo1);
		nomesTitulo2 = new JLabel(" 2 - Nome:");
		nomesTitulo2.setBounds(20,69,485,40);
		nomesTitulo2.setOpaque(true);
		nomesTitulo2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(nomesTitulo2);
		nomesTitulo3 = new JLabel(" 3 - Nome:");
		nomesTitulo3.setBounds(20,108,485,40);
		nomesTitulo3.setOpaque(true);
		nomesTitulo3.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(nomesTitulo3);
		nomesTitulo4 = new JLabel(" 4 - Nome:");
		nomesTitulo4.setBounds(20,147,485,40);
		nomesTitulo4.setOpaque(true);
		nomesTitulo4.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(nomesTitulo4);
		nomesTitulo5 = new JLabel(" 5 - Nome:");
		nomesTitulo5.setBounds(20,186,485,40);
		nomesTitulo5.setOpaque(true);
		nomesTitulo5.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(nomesTitulo5);
		nomesTitulo6 = new JLabel(" 6 - Nome:");
		nomesTitulo6.setBounds(20,225,485,40);
		nomesTitulo6.setOpaque(true);
		nomesTitulo6.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(nomesTitulo6);
		nomesTitulo7 = new JLabel(" 7 - Nome:");
		nomesTitulo7.setBounds(20,264,485,40);
		nomesTitulo7.setOpaque(true);
		nomesTitulo7.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(nomesTitulo7);
		nomesTitulo8 = new JLabel(" 8 - Nome:");
		nomesTitulo8.setBounds(20,303,485,40);
		nomesTitulo8.setOpaque(true);
		nomesTitulo8.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(nomesTitulo8);
		
		nome1 = new JTextField();
		nome1.setBounds(80,37,170,26);
		nome1.setEnabled(false);
		add(nome1);
		nome2 = new JTextField();
		nome2.setBounds(80,76,170,26);
		nome2.setEnabled(false);
		add(nome2);
		nome3 = new JTextField();
		nome3.setBounds(80,115,170,26);
		nome3.setEnabled(false);
		add(nome3);
		nome4 = new JTextField();
		nome4.setBounds(80,154,170,26);
		nome4.setEnabled(false);
		add(nome4);
		nome5 = new JTextField();
		nome5.setBounds(80,193,170,26);
		nome5.setEnabled(false);
		add(nome5);
		nome6 = new JTextField();
		nome6.setBounds(80,232,170,26);
		nome6.setEnabled(false);
		add(nome6);
		nome7 = new JTextField();
		nome7.setBounds(80,271,170,26);
		nome7.setEnabled(false);
		add(nome7);
		nome8 = new JTextField();
		nome8.setBounds(80,310,170,26);
		nome8.setEnabled(false);
		add(nome8);
		
		String[] coresStrings = {"Escolha uma cor","Amarelo","Branco" ,"Azul" ,"Preto" ,"Rosa","Rocho" ,"Verde" ,"Vermelho"};
		cores1 = new JComboBox<String>(coresStrings);
		cores1.setBounds(280, 37, 170, 26);
		cores1.setEnabled(false);
		cores1.addActionListener(this);
		add(cores1,1);
		
		cores2 = new JComboBox<String>(coresStrings);
		cores2.setBounds(280, 76, 170, 26);
		cores2.setEnabled(false);
		cores2.addActionListener(this);
		add(cores2,1);
		
		cores3 = new JComboBox<String>(coresStrings);
		cores3.setBounds(280, 115, 170, 26);
		cores3.setEnabled(false);
		cores3.addActionListener(this);
		add(cores3,1);
		
		cores4 = new JComboBox<String>(coresStrings);
		cores4.setBounds(280, 154, 170, 26);
		cores4.setEnabled(false);
		cores4.addActionListener(this);
		add(cores4,1);
		
		cores5 = new JComboBox<String>(coresStrings);
		cores5.setBounds(280, 193, 170, 26);
		cores5.setEnabled(false);
		cores5.addActionListener(this);
		add(cores5,1);
		
		cores6 = new JComboBox<String>(coresStrings);
		cores6.setBounds(280, 232, 170, 26);
		cores6.setEnabled(false);
		cores6.addActionListener(this);
		add(cores6,1);
		
		cores7 = new JComboBox<String>(coresStrings);
		cores7.setBounds(280, 271, 170, 26);
		cores7.setEnabled(false);
		cores7.addActionListener(this);
		add(cores7,1);
		
		cores8 = new JComboBox<String>(coresStrings);
		cores8.setBounds(280, 310, 170, 26);
		cores8.setEnabled(false);
		cores8.addActionListener(this);
		add(cores8,1);
		
		ativa1 = new JButton();
		ativa1.setBounds(465, 35, 30, 30);
		ativa1.setIcon(icon);
		ativa1.addActionListener(this);
		add(ativa1,1);
		
		ativa2 = new JButton();
		ativa2.setBounds(465, 74, 30, 30);
		ativa2.setIcon(icon);
		ativa2.addActionListener(this);
		add(ativa2,1);

		ativa3 = new JButton();
		ativa3.setBounds(465, 113, 30, 30);
		ativa3.setIcon(icon);
		ativa3.addActionListener(this);
		add(ativa3,1);

		ativa4 = new JButton();
		ativa4.setBounds(465, 152, 30, 30);
		ativa4.setIcon(icon);
		ativa4.addActionListener(this);
		add(ativa4,1);

		ativa5 = new JButton();
		ativa5.setBounds(465, 191, 30, 30);
		ativa5.setIcon(icon);
		ativa5.addActionListener(this);
		add(ativa5,1);

		ativa6 = new JButton();
		ativa6.setBounds(465, 230, 30, 30);
		ativa6.setIcon(icon);
		ativa6.addActionListener(this);
		add(ativa6,1);

		ativa7 = new JButton();
		ativa7.setBounds(465, 269, 30, 30);
		ativa7.setIcon(icon);
		ativa7.addActionListener(this);
		add(ativa7,1);

		ativa8 = new JButton();
		ativa8.setBounds(465, 308, 30, 30);
		ativa8.setIcon(icon);
		ativa8.addActionListener(this);
		add(ativa8,1);

		iniciar = new JButton("Iniciar");
		iniciar.setBounds(375,350,130,40);
		iniciar.addActionListener(this);
		add(iniciar);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == iniciar){
			List<Jogador> jogadores = new ArrayList<Jogador>();

			if(nome1.isEnabled()){
				jogadores.add(new Jogador(nome1.getText(), nomesTitulo1.getBackground()));
			} 
			if(nome2.isEnabled()){
				jogadores.add(new Jogador(nome2.getText(), nomesTitulo2.getBackground()));
			}
			if(nome3.isEnabled()){
				jogadores.add(new Jogador(nome3.getText(), nomesTitulo3.getBackground()));
			}
			if(nome4.isEnabled()){
				jogadores.add(new Jogador(nome4.getText(), nomesTitulo4.getBackground()));
			} 
			if(nome5.isEnabled()){
				jogadores.add(new Jogador(nome5.getText(), nomesTitulo5.getBackground()));
			} 
			if(nome6.isEnabled()){
				jogadores.add(new Jogador(nome6.getText(), nomesTitulo6.getBackground()));
			} 
			if(nome7.isEnabled()){
				jogadores.add(new Jogador(nome7.getText(), nomesTitulo7.getBackground()));
			} 
			if(nome8.isEnabled()){
				jogadores.add(new Jogador(nome8.getText(), nomesTitulo8.getBackground()));
			} 
			
			criarPartida(jogadores);
		} else if (e.getSource() == ativa1){
			if(nome1.isEnabled()){
				nome1.setEnabled(false);
				cores1.setEnabled(false);
				ativa1.setIcon(icon);
			} else {
				nome1.setEnabled(true);
				cores1.setEnabled(true);
				ativa1.setIcon(icon2);
			}
		}else if (e.getSource() == ativa2){
			if(nome2.isEnabled()){
				nome2.setEnabled(false);
				cores2.setEnabled(false);
				ativa2.setIcon(icon);
			} else {
				nome2.setEnabled(true);
				cores2.setEnabled(true);
				ativa2.setIcon(icon2);
			}
		}else if (e.getSource() == ativa3){
			if(nome3.isEnabled()){
				nome3.setEnabled(false);
				cores3.setEnabled(false);
				ativa3.setIcon(icon);
			} else {
				nome3.setEnabled(true);
				cores3.setEnabled(true);
				ativa3.setIcon(icon2);
			}
		}else if (e.getSource() == ativa4){
			if(nome4.isEnabled()){
				nome4.setEnabled(false);
				cores4.setEnabled(false);
				ativa4.setIcon(icon);
			} else {
				nome4.setEnabled(true);
				cores4.setEnabled(true);
				ativa4.setIcon(icon2);
			}
		}else if (e.getSource() == ativa5){
			if(nome5.isEnabled()){
				nome5.setEnabled(false);
				cores5.setEnabled(false);
				ativa5.setIcon(icon);
			} else {
				nome5.setEnabled(true);
				cores5.setEnabled(true);
				ativa5.setIcon(icon2);
			}
		}else if (e.getSource() == ativa6){
			if(nome6.isEnabled()){
				nome6.setEnabled(false);
				cores6.setEnabled(false);
				ativa6.setIcon(icon);
			} else {
				nome6.setEnabled(true);
				cores6.setEnabled(true);
				ativa6.setIcon(icon2);
			}
		}else if (e.getSource() == ativa7){
			if(nome7.isEnabled()){
				nome7.setEnabled(false);
				cores7.setEnabled(false);
				ativa7.setIcon(icon);
			} else {
				nome7.setEnabled(true);
				cores7.setEnabled(true);
				ativa7.setIcon(icon2);
			}
		}else if (e.getSource() == ativa8){
			if(nome8.isEnabled()){
				nome8.setEnabled(false);
				cores8.setEnabled(false);
				ativa8.setIcon(icon);
			} else {
				nome8.setEnabled(true);
				cores8.setEnabled(true);
				ativa8.setIcon(icon2);
			}
		}else if (e.getSource() == cores1){
			nomesTitulo1.setBackground(getCor(cores1.getSelectedItem().toString()));
		}else if (e.getSource() == cores2){
			nomesTitulo2.setBackground(getCor(cores2.getSelectedItem().toString()));
		}else if (e.getSource() == cores3){
			nomesTitulo3.setBackground(getCor(cores3.getSelectedItem().toString()));
		}else if (e.getSource() == cores4){
			nomesTitulo4.setBackground(getCor(cores4.getSelectedItem().toString()));
		}else if (e.getSource() == cores5){
			nomesTitulo5.setBackground(getCor(cores5.getSelectedItem().toString()));
		}else if (e.getSource() == cores6){
			nomesTitulo6.setBackground(getCor(cores6.getSelectedItem().toString()));
		}else if (e.getSource() == cores7){
			nomesTitulo7.setBackground(getCor(cores7.getSelectedItem().toString()));
		}else if (e.getSource() == cores8){
			nomesTitulo8.setBackground(getCor(cores8.getSelectedItem().toString()));
		}
	}

	public void criarPartida(List<Jogador> jogadores) {
		jogadores.add(new Jogador("Richard", Color.pink));
		jogadores.add(new Jogador("Jederson", Color.black));
		jogadores.add(new Jogador("Lucas", Color.RED));
		try{

			TelaPartida tl = new TelaPartida(jogadores);
			new Thread(tl).start();
		
		} catch (Exception ex){
			System.out.println(ex);
		}
	}

	private Color getCor(String selectedItem) {
		if(selectedItem.equals("Amarelo")){
			return Color.YELLOW;
		} if(selectedItem.equals("Branco")){
			return Color.WHITE;
		} if(selectedItem.equals("Azul")){
			return Color.BLUE;
		} if(selectedItem.equals("Preto")){
			return Color.BLACK;
		} if(selectedItem.equals("Rosa")){
			return Color.PINK;
		} if(selectedItem.equals("Rocho")){
			return Color.lightGray;
		} if(selectedItem.equals("Verde")){
			return Color.GREEN;
		} if(selectedItem.equals("Vermelho")){
			return Color.RED;
		} 
		return new Color(-1118482);
	}
}
