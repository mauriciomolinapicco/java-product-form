package Formulario;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Prueba listener");
		PanelFormulario pb = new PanelFormulario();

		f.getContentPane().add(pb);
		
		f.pack(); //ajusta automaticamente el tamano
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
