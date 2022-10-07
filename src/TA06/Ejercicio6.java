package TA06;
import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {

		String numeroString = JOptionPane.showInputDialog("Introduzca un número:");


		if (Integer.parseInt(numeroString) > 1) {
			JOptionPane.showMessageDialog(null, "El número " + numeroString + " tiene " + dameCifras(numeroString) + " cifras.");

		} else {
			JOptionPane.showMessageDialog(null, numeroString + " no es un input válido.");
		}
	}

	public static int dameCifras(String numero) {

		try {
			int cifra = numero.length();
			return cifra;
		} catch (Exception e) {
			return -1;
		} 

	}

}
