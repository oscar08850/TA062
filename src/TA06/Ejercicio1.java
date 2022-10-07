package TA06;
import javax.swing.JOptionPane;

//Calcula el área de un circulo, cuadrado o triangulo.


public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String figura = JOptionPane.showInputDialog("Introduce: Circulo, Cuadrado o Triangulo");
		if ("Circulo".equals(figura)) {
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Radio: "));
			JOptionPane.showMessageDialog(null, "El area es: " + areaCirculo(radio));
		}
		
		else if ("Cuadrado".equals(figura)) {
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado: "));
			JOptionPane.showMessageDialog(null, "El area es: " + areaCuadrado(lado));
		}
		
		else if ("Triangulo".equals(figura)) {
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado: "));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce altura: "));

			JOptionPane.showMessageDialog(null, "El area es: " + areaTriangulo(lado,altura));
		}
	}

	public static double areaCuadrado (double n1) {
		
		double area = (n1*n1);
		System.out.println("El radio es: " + area);
		return area;
		
	}
	public static double areaTriangulo (double n1, double n2) {
		
		double area = (n1*n2)/2;
		System.out.println("El radio es: " + area);
		return area;
		
	}
	
	public static double areaCirculo (double n1) {
		
		double area = Math.PI * Math.pow(n1, 2);
		System.out.println("El radio es: " + area);
		return area;
		
	}

}
