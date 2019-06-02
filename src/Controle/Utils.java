package Controle;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.ImageIO;

import Telas.TelaPartida;

public class Utils {

	public static void printarTela(){
		try{
			Thread.sleep(1000l);
			Robot robot = new Robot();
			ImageIO.write(robot.createScreenCapture(new Rectangle(1366, 768)), "JPG", new File( "C:\\Users\\lelloloc\\Desktop\\asdf.jpg"));
			robot.mouseMove(5, 25);
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_F4);
			Thread.sleep(1000l);

		} catch (Exception e){
			System.out.println("Erro ao tentar printar a tela");
		}
	}
	
	public static void salvarEstado(TelaPartida tp){
        try {
            FileOutputStream arquivoGrav = new FileOutputStream("c:/saida.ser");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(tp);
            objGravar.close();
            System.out.println("Objeto gravado com sucesso!");
        } catch (Exception e){
        	System.out.println("Não foi possivel salvar o estado da partida");
        }
	}
	
	public static TelaPartida carregarEstado(){
		TelaPartida tp = null;
		try {
        	FileInputStream arquivoLeitura = new FileInputStream("c:/saida.ser");
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
            System.out.println(objLeitura.readObject());
            tp = (TelaPartida) objLeitura.readObject();
            arquivoLeitura.close();
        } catch (Exception e){
        	System.out.println("Não foi possivel salvar o estado da partida");
        }
		return tp;
	}
}
