package controle;

import java.util.Scanner;

public class MediaFinal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	
		System.out.print("Digite a primeira nota parcial: ");
		double n1 = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota parcial: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1 + n2)/2;
		
		if(media <=10 && media >=7) {
			System.out.printf("Sua nota foi: %.1f. Parabéns!! você foi aprovado!", media);
		} else if(media < 7 && media > 4) {
			System.out.printf("Sua nota foi: %.1f. Você está em recuperação!", media);
		} else {
			System.out.printf("Sua nota foi: %.1f. Você está reprovado!", media);
		}
		
		entrada.close();
	}
}
	
