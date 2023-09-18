package controle;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
	/*Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
	 * Armazene um numero aleatório em uma variável.
	 * O Jogador tem 10 tentativas para adivinhar o número gerado.
	 * Ao final de cada tentativa, imprima a quantidade de tentativas
	 * restantes, e imprima se o número inserido é maior ou menor 
	 * do que o número armazenado.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Random aleatorio = new Random();
		
		int numaleatorio = aleatorio.nextInt(101);
		int TentativasTotais = 10;
		
		System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar um número entre 0 e 100.");
		
        while (TentativasTotais > 0) {
            System.out.printf("Tentativas restantes: %d\n", TentativasTotais);
            System.out.print("Digite o seu palpite: ");
            
            int palpite = entrada.nextInt();
            
            if (palpite == numaleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                break;
            } else if (palpite < numaleatorio) {
                System.out.printf("O número sorteado é maior que %d.\n", palpite);
            } else {
            	System.out.printf("O número sorteado é menor que %d.\n", palpite);
            }
            
            TentativasTotais--;
        }
        
        if (TentativasTotais == 0) {
            System.out.println("Fim do jogo! Suas tentativas acabaram. O número correto era: " + numaleatorio);
        }
        
        entrada.close();
    }
}
		