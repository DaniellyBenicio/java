package controle;

import java.util.Scanner;

public class SomaDeNumerosPositivos {
	/*programa que enquanto estiver recebendo números positivos, imprime
	 *   no console a soma dos números inseridos, caso receba um número 
	 *   negativo, encerre o programa. 
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num;
		int soma = 0;
		
		do {
			System.out.println("Digite um número inteiro "
					+ "(ou negativo para sair): ");
			num = entrada.nextInt();
			
			if(num > 0) {
				soma += num;
				
			}
		}while(num > 0);
		
		System.out.printf("A soma dos números é %d", soma);
		
		entrada.close();
	}

}
