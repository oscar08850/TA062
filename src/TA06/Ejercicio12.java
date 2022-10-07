package TA06;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {   

	public static void main(String[] args) {

		// Primero pedimos cuantos números querrá el usuario.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cuántos posiciones tendrá el array? ");
		int posiciones = scanner.nextInt();
		System.out.print("Que último digito quieres? ");
		String digitoFinal = scanner.next();
		scanner.close();

		// creamos el vector con el numero de posiciones que nos da el usuario
		int num[] = new int[posiciones];

		// rellenamos el vector con la funcion rellenaArray que llamará a la de
		// dameRandom que a su vez llamará a la funcion compruebaPrimo.
		num = rellenaArray(num);

		// mostramos el array
		muestraArray(num);

		// mostramos el segundo array con numeros acabados en digitoFinal
		muestraArrayDigFin(num, digitoFinal);
	}

	private static void muestraArrayDigFin(int[] num, String digitoFinal) {
		int nume = 0;
		try {
			nume = Integer.parseInt(digitoFinal); // comprobamos que se haya metido un número
		} catch (Exception e) {
			System.out.println("No te sabes lo que es un número?");
			return;
		}

		boolean seguir = false;
		if (nume >= 0 & nume <= 9) { // Comprobamos que el número sea positivo y de solo un digito
			seguir = true;
		} else {
			System.out.println("Debes introducir un numero entre el 0 y 9");
			return;
		}

		ArrayList<Integer> ArrayBuena = new ArrayList<>(); // Creamos el array que mostraremos al final en el que
															// pondremos los números que cumplan la condición
		while (seguir) {
			for (int i = 0; i < num.length; i++) {
				if (acabaEnDigito(num[i], nume)) {
					ArrayBuena.add(num[i]);
				}
			}
			seguir = false;
		}

		System.out.print("El array final es: ");
		for (Object o : ArrayBuena) {
			System.out.print("[" + o + "]");
		}

	}

	private static boolean acabaEnDigito(int numeroEntero, int digitoFinal) {
		if (numeroEntero % 10 == digitoFinal) {
			return true;
		} else {
			return false;
		}
	}

	private static void muestraArray(int[] num) {

		System.out.print("El array creado aletoriamente es: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print("[" + num[i] + "]");
		}
		System.out.println();
	}

	private static int[] rellenaArray(int[] num) {
		for (int i = 0; i < num.length; i++) {
			num[i] = dameRandom(0, 300);
		}
		return num;
	}

	private static int dameRandom(int min, int max) {
		Random random = new Random();
		int numero = 0;
		numero = random.nextInt(max - min + 1) + min;
		return numero;
	}
}
