package controle;

import java.util.Scanner;

public class NumeroPrimo {
	//divisivel por 1 e por ele mesmo;
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		
		int contador = 0;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contador+=1;
			}
		}
		
		if (contador == 0 && num > 1) {
			System.out.printf("O número %d é primo!", num);
		} else {
			System.out.printf("O número %d não é primo!", num);
		}
		
		entrada.close();

	}
}
	
