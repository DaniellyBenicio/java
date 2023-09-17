package Fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		//Programa que ler o valor da base e 
		//da altura de um triângulo e calcule a área.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.print("Informe o valor da altura: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura)/2;
		
		System.out.printf("A área do triângulo: %.1f", area);
		
		entrada.close();
		
	}

}
