package TA06;
import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Primero pedimos el número que queremos ver si es primo.
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para ver si es primo: "));

		boolean primo = esPrimo(numero);

		if (primo) {
			JOptionPane.showMessageDialog(null, "El número: " + numero + " es primo!");
		} else {
			JOptionPane.showMessageDialog(null, "El número: " + numero + " no es primo!");
		}
 
	}

	private static boolean esPrimo(int numero) {

		boolean esPrimo = true;

		if (numero > 1) {
			for (int i = 2; i < numero / 2; i++) {
				if (numero % i == 0) {
					System.out.println("No es primo pq se divide entre " + i);
					esPrimo = false;
					break;
				}
			}

		}
		return esPrimo;
	}
}
