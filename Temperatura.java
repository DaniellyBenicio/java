package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(F - 32) * 5/9 = C
		//f e c variaveis 
		//32 e 5/9 constantes
		
		//jshell
		
		final double AJUSTE = 32;
		final double FATOR = 5/9.0;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é: " + celsius + "ºC");
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é: " + celsius + "ºC");
		
	}

}
