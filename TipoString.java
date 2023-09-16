package Fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá, pessoal".charAt(5));
		//charAt = qual a letra no indice tal
		// e ai atribui dentro de parenteses ()
		
		String s = "Boa tarde";		
		System.out.println(s.concat("!!!"));//concatenar
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("Olá"));//inicia com
		System.out.println(s.length());//tamanho
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.equals("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 32;
		var salario = 12345.987;
		System.out.println("Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade +
				"\nSalário: " + salario);
		
		System.out.printf("O senhor %s %s tem %d e ganha %.2f",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d e ganha %.2f",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("ue"));
		System.out.println("Frase qualquer".indexOf("ue"));
		System.out.println("Frase qualquer".substring(11));
		System.out.println("Frase qualquer".substring(11, 13));
	}
}
