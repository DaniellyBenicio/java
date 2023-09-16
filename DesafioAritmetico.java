package Fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		/*
		 * int a = 3 * 4 - 10;
		 * int b = (int) Math.pow(a, 3);
			System.out.println(a);
			System.out.println(b);
		 */
		double A = Math.pow(6 * (3 + 2), 2);
		double dA = 3 * 2;
		
		double B = (1-5) * (2-7);
		double dB = 2;
		
		double supA = A/dA;
		double supB = Math.pow(B/dB, 2);
		
		double num = Math.pow(supA - supB, 3);
		double denominador = Math.pow(10, 3);
		
		double resultado = num/denominador;
		
		System.out.println("O resultado é:  " + resultado);
		
	}

}
