package Fundamentos;

import java.util.Scanner;

public class ValorAoCuboEQuadrado {
	public static void main(String[] args) {
		//Programa que ler um valor e apresente 
		//os resultados ao quadrado e ao cubo do valor.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor: ");
		double valor = entrada.nextDouble();
		
		
		double Q = valor * valor;
		double C = valor * valor * valor;
		
		System.out.printf("Valor ao quadrado: %.1f" + "m²\n", Q);
		System.out.printf("Valor ao cubo: %.1f" + "m³", C);
		
		//outra forma de fazer é usando o math.pow
		//double Q = Math.pow(valor, 2);		
		//double C = Math.pow(valor, 3);
		
		entrada.close();
		
	}

}
