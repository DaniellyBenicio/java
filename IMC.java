package Fundamentos;

import java.util.Scanner;

public class IMC {
	public static void main (String[] args) {
		//Programa que ler o peso e a altura do usuário e imprima no console o IMC.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Informe a altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso/(altura * altura) * 10000;
		//usado o 10000 para andar as casas decimais necessarias
		//e nao ficar 0.0002 por exemplo.

		
		System.out.printf("IMC: " + "%.2f", imc);
		
		entrada.close();		
		
	}

}
