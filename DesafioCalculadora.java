package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//ler num1
		//ler num2
		//+ - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a operação desejada: ");
		String op = entrada.next();
		
		double r = "+".equals(op) ? num1 + num2 : 0;
		r = "-".equals(op) ? num1 - num2 : r;
		r = "*".equals(op) ? num1 * num2 : r;
		r = "/".equals(op) ? num1 / num2 : r;
		r = "%".equals(op) ? num1 % num2 : r;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, op, num2, r);
		entrada.close();
	}

}
