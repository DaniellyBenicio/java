package Fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());//conta a qnt de string
		//converte o numero para a string = toString
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		System.out.println(Integer.toString(num2).length());
		System.out.println("\n");
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}
}
