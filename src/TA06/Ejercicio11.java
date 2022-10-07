package TA06;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el tamaño de las arrays: ");
		int tamaño = Integer.parseInt(scanner.next());
		scanner.close();

		// Declaramos las Arrays
		int array1[] = new int[tamaño];
		int array2[] = new int[tamaño];

		// Rellenamos el array1 con valores aleatorios
		rellenaArray(array1);

		// Clonamos la Array1 en Array2. No es lo mismo que Array2=Array1!
		array2 = array1.clone();

		// Rellenamos Array2 sin que afecte a Array1.
		rellenaArray(array2); 

		// Guardamos el resultado de multiplicar las entradas de ambas arrays
		int array3[] = multiplicarArrays(array1, array2);

		// Mostramos las 3 Arrays
		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));
		System.out.println("Array Multiplicación: " + Arrays.toString(array3));

	}

	public static void rellenaArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = dameRandom(0, 200);
			// array[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
		}

	}

	public static int[] multiplicarArrays(int[] array1, int[] array2) {

		int arrayMultiplicacion[] = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			arrayMultiplicacion[i] = (array1[i] * array2[i]);

		}

		return arrayMultiplicacion;

	}

	private static int dameRandom(int min, int max) { // Devuelve un random a entre min y max incluidos.
		Random random = new Random();
		int numero = random.nextInt(max - min + 1) + min; 
		return numero;
	}

}
