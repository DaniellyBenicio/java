package Fundamentos;

import java.util.Scanner;

public class FormulaDeBhaskara {
	public static void main(String[] args) {
		/* Criar um programa que resolve equações do segundo grau 
		 * (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
		 * Use como exemplo a = 1, b = 12 e c = -13.Encontre o delta
		 */
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Equação: ax² + bx + c = 0");
		
		System.out.print("\nDigite o valor de A: ");
		int a = entrada.nextInt();

		System.out.print("\nDigite o valor de B: ");
		int b = entrada.nextInt();

		System.out.print("\nDigite o valor de C: ");
		int c = entrada.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf(
				"\nSua equação é: %dx² + %dx + %d = 0",
				a, b, c);
		
		System.out.printf("\nDelta: %d\n", delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nx1: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nx2: %.2f" ,x2);
		
		entrada.close();
		
	}
	
}
