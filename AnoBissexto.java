package controle;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		// informa se o ano atual é um ano bissexto;
		
		Scanner entrada = new Scanner(System.in);
		//ano bissexto: divisivel por 4 e 400 e nao divisivel por 100.
		
		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
			System.out.printf("%d é um Ano Bissexto!", ano);
		} else {
			System.out.printf("O ano %d não é bisexto", ano);
		}
		
		
		entrada.close();
	}

}
