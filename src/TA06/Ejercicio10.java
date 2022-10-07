package TA06;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 { 

	public static void main(String[] args) {

		// Primero pedimos cuantos números querrá el usuario.

		Scanner scanner = new Scanner(System.in);
		System.out.print("Cuántos posiciones tendrá el array? ");
		int posiciones = scanner.nextInt();
		scanner.close();

		// creamos el vector con el numero de posiciones que nos da el usuario
		int num[] = new int[posiciones];

		// rellenamos el vector con la funcion rellenaArray que llamará a la de
		// dameRandom que a su vez llamará a la funcion compruebaPrimo.
		num = rellenaArray(num);

		// mostramos el array
		muestraArray(num);

		// Encontramos el número más grande
		dameGrande(num);

	}

	private static void dameGrande(int[] num) {
		int grande = 0, posición = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > grande) {
				grande = num[i];
				posición = i;
			}
		}
		System.out.println("El número primo más grande es: " + grande + " y está en la posición: " + posición + ". ");

	}

	private static void muestraArray(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println("En la posicion numero " + i + " Tenemos: [" + num[i] + "]");
		}
		System.out.print("El array es: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print("[" + num[i]+ "]");
		}
		System.out.println();
	}

	private static int[] rellenaArray(int[] num) {
		for (int i = 0; i < num.length; i++) {
			num[i] = dameRandom(0, 10000);
		}
		return num;
	}

	private static int dameRandom(int min, int max) {
		Random random = new Random();
		boolean esPrimo = false;
		int numero = 0;
		while (!esPrimo) {
			numero = random.nextInt(max - min + 1) + min; // Parece ser que no hay un range como en phyton.
			esPrimo = compruebaPrimo(numero);
		}
		return numero;
	}

	private static boolean compruebaPrimo(int num) {
		if (num == 0 || num == 1 || num == 2) { //Podría simplemente limitar el minimo al número 3 en dameRandom pero así uso los OR.
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
