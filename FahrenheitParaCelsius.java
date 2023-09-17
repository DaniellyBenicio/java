package Fundamentos;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		//Programa que ler temperatura em Fahrenheit e converta para Celsius
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a  temperatura em Fahrenheit: ");
		double tF = entrada.nextDouble();
		
		double C;
		C = (tF - 32)/1.8;
		
		System.out.printf("A temperatura em Celsius é: " + "%.2f", C);
		
		entrada.close();
		
	}

}
