package controle;

import java.util.Scanner;

public class NumPrimoSwitch {
	//Numero primo, utilizando a estrutura switch.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		
		int contador = 0;
		
		if(num == 1) {
			contador = 1;
		}
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contador+=1;
			}
		}
		
		switch (contador) {
			case 0:
				System.out.printf("O número %d é primo!", num);
				break;
			default:
				System.out.printf("O número %d não é primo!", num);
		}
		
		entrada.close();
	}
}
