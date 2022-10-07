package TA06;
import java.util.Random;
import java.util.Scanner;



public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Primero pedimos cuantos números querrá el usuario.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cuántos posiciones tendrá el array? ");
		int posiciones = scanner.nextInt();
		scanner.close();
		
		//creamos el vector con el numero de posiciones que nos da el usuario
		int num[] = new int[posiciones];
		
		//rellenamos el vector con la funcion rellenaArray que llamará a la de dameRandom
		num = rellenaArray(num);
		
		//mostramos el array
		muestraArray(num);
		  
		
	}

	private static void muestraArray(int [] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println("En la posicion numero " + i + " Tenemos: [" + num[i] + "]");
		}
	}

	private static int[] rellenaArray(int[] num) {
		for (int i = 0; i< num.length; i++) {
			num[i] = dameRandom(0, 9);
		}
		return num;
	}

	private static int dameRandom(int min, int max) {
		Random random = new Random();
		int numero = random.nextInt(max - min + 1) + min; //Parece ser que no hay un range como en phyton.
		return numero;
	}

	


}
