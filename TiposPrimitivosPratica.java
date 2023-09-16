package Fundamentos;

public class TiposPrimitivosPratica {
	public static void main(String[] args) {
		//Tipos numericos inteiros
		
		byte anosdeEmpresa = 127;
		short numerodeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//tipos numericos reais
		float salario = 1445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Boleano
		
		boolean estadeFerias = false; //true
		
		//tipo caractere
		
		char status = 'A';//ativo
		
		//dias de empresa
		System.out.println(anosdeEmpresa * 365);
		
		//numeros de viagens
		
		System.out.println(numerodeVoos/2);
		
		//pontos por real
		
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha -->" + salario);
		
		System.out.println("Férias?" + estadeFerias);
		
		System.out.println("Status: " + status);
	}

}
