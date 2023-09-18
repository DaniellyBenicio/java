package controle;

import java.util.Scanner;

public class LetraALetra {
	public static void main(String[] args) {
		//programa que receba uma palavra e imprime no console letra por letra.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe uma palavra: ");
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray();
		//convertendo palavra em array de caracteres
		
		for(int i = 0; i<letras.length; i++) {
			System.out.println(letras[i]);
	
		}
				
		entrada.close();
	}

}
