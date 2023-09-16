package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", //%n tambem quebra a linha
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
		/*
		 * teclado.nextLine(); //lê o "\\\\n" que o teclado.nextInt()
		 *  deixa para trás.
		 *  
		 *  
		 *  o método nextLine() vai ler tudo que estiver no buffer de entrada 
		 *  até encontrar um "\n". Como o nextInt() deixou um "\n" para trás,
		 *   é esse o valor que o nextLine() lê. Isso conclui a leitura e a 
		 *   próxima linha de código, que é "Qual o seu sobrenome?", é impressa.

			Para resolver esse problema, precisamos "pegar" o "\n" que o nextInt() 
			não lê. Isso pode ser feito colocando um comando nextLine() depois do
			 nextInt()
		 */
		
	}

}
