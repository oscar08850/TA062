package TA06;
import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Primero pedimos el número que queremos ver si es primo.
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para calcular su factorial: "));
		JOptionPane.showMessageDialog(null, numero + "! = " + factorial(numero));

	}

	private static int factorial(int numero) {
		int resultado = 1;
		for (int i = numero; i > 0; i--) {
			resultado = resultado * i;
		}
		return resultado;
	}

}
 