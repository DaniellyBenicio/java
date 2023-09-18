package controle;

import java.util.Scanner;

public class VerificarSePar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();

		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) {
				System.out.printf("%d é par e está entre o intervalo (0-10)!", num);
			} else {
				System.out.printf("%d é ímpar e está entre o intervalo (0-10)!", num);
			}
		} else {
			System.out.printf("O número não está no intervalo!");
		}
		entrada.close();
	}
}
		
