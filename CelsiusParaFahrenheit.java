package Fundamentos;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String [] args) {
		//programa que ler a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a temperatura em Celsius: ");
		double C = entrada.nextDouble();
		
		//Formula = Multiplicamos a temperatura em ºC por 1,8 e somamos 32 ao resultado.
		
		double F = C * 1.8 + 32; 
		
		System.out.printf("A temperatura em Fahrenheit é: " + "%.2f", F);
		
		entrada.close();
	
	}
	
	

}
