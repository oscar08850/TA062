package TA06;
import java.util.Scanner;


public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("A que lo quieres convertir? dolares, libras, yenes ");
		String monedaString = scanner.nextLine();
		System.out.println(monedaString);

		System.out.print("Introduce la cantidad de euros: ");
		double dinero = scanner.nextInt();
		
		scanner.close();
		

		System.out.println("La conversión de euros a "+ monedaString + " es: " + conversion(dinero, monedaString) + " " + monedaString);
	
	} 

	private static double conversion(double dinero, String moneda) {
		
		if ("libras".equals(moneda)) {
			return dinero * 0.86;
		}
		
		else if ("dolares".equals(moneda)) {
			return dinero * 1.28611;
		}
		
		else if ("yenes".equals(moneda)) {
			return dinero * 129.852;
		}
		return dinero;
		
	}


}
