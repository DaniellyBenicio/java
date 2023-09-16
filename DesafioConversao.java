package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String m1 = entrada.next().replace(",", ".");
				
		System.out.print("\nDigite o segundo salário: ");
		String m2 = entrada.next().replace(",", ".");
		
		System.out.print("\nDigite o terceiro salário: ");
		String m3 = entrada.next().replace(",", ".");
		
		double sal1 = Double.parseDouble(m1);
		double sal2 = Double.parseDouble(m2);
		double sal3 = Double.parseDouble(m3);
		
		double media = (sal1 + sal2 + sal3)/3;
		
		System.out.println("A média salarial: " + media);
		System.out.printf("%.2f" + " é a média salarial", media);
		
		entrada.close();
	}

}
