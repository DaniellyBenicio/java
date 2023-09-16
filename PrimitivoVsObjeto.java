package Fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		//tudo em java é objeto tirando so 8 primitivos
		
		String s = new String("texto");
		s.toUpperCase();
		
		// Wrappers são a versão objeto dos tipos
		// primitivos!
		int a = 123;
		System.out.println(a);
	}

}
