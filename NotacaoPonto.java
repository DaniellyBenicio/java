package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		//string tem que ser com S maiusculo
		
		/*
		 * s.toUpperCase();//faz com que a string seja convertida
	
						//para maiuscula, mas nao altera a forma inicial
		*/
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		//posso colocar tudo na mesma linha
		//ou assim, quebrando a linha
		System.out.println(y);
	}

}
