package TA06;
import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Primero pedimos cuantos números querrá el usuario.
		int cantidad =Integer.parseInt(JOptionPane.showInputDialog("Cuántos números aleatorios quieres?"));
		
		//Y los valores entre los que se moveran los random.
		int min =Integer.parseInt(JOptionPane.showInputDialog("Número minimo"));
		int max =Integer.parseInt(JOptionPane.showInputDialog("Número máximo"));
		
		
		
		for (int i = 0; i< cantidad; i++) { 
			JOptionPane.showMessageDialog(null, "Random: " + dameRandom(min, max));

		}
		
	}

	private static int dameRandom(int min, int max) {
		Random random = new Random();
		int numero = random.nextInt(max - min + 1) + min; //Parece ser que no hay un range como en phyton.
		return numero;
	}
	

}
