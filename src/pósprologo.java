import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class p�sprologo extends JFrame{

	public p�sprologo() {
		new Iniciar().start();
		Componentes();
		Eventos();
		Frame();
	}
	
	public void Componentes() {
		setLayout(null);
	}
	
	public void Eventos() {
		
	}
	
	public void Frame() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(600, 310); // Tamanho do JFrame
		setUndecorated(true); // Desativa a Decora��o
		setLocationRelativeTo(null); // Tela Centralizada
		setVisible(true);
	}
	
	public static void main (String args[]) {
		new p�sprologo();
	}
	
	public class Iniciar extends Thread{
		public void run() {
			for(int i = 0; i < 255; i++) {
				try {
					getContentPane().setBackground(new Color(i, i, i));
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
