package TA06;
import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para convertir a binario: "));
		JOptionPane.showMessageDialog(null, "El número: " + numero + " en binario es: " + dameBinary(numero));

	}

	private static String dameBinary(int bin) {
		
		int numero = bin;
		String retorno = "";
		while (numero > 0) {
			retorno = numero%2 + retorno;
			numero = numero / 2;	
		}
		return retorno;
	}
	
	
 

}
