package TA06;
import java.util.Scanner;


public class Ejercicio8 {

	public static void main(String[] args) {
		
		int num[] = new int[10];
		
		//Pedimos los numeros
		num = rellenarArray(num);
		

		
		//mostramos el array
		muestraArray(num);
		
	}

	private static void muestraArray(int[] num) {
		for (int i = 0; i<num.length; i++) {
			System.out.print("[" + num[i] + "]");
		} 
		
	}

	private static int[] rellenarArray(int[] num) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i<num.length; i++) {
			num[i] = scanner.nextInt();
		}
		System.out.println("");
		scanner.close();
		return num;
	}
	
	


}
