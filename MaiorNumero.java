package controle;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		//programa que recebe 10 valores e ao final imprima o maior número.
		
		Scanner entrada = new Scanner (System.in);
		
		int maior = 0; 
		
		for (int i = 1; i <11; i++) {
			System.out.printf("\nInforme o %dº valor: ", i);
			int valor = entrada.nextInt();
			
			if (valor > maior) {
				maior = valor;
			}
		}
		
		System.out.printf("O maior número digitado foi: %d%n", maior);
		
		entrada.close();
	}

}
