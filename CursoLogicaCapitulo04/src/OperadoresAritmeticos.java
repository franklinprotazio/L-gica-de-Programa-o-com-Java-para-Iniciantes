
public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		Integer adicao = 1 + 1;
		System.out.println("Adicao: " + adicao);
	
		Integer subtracao = 1 -1;
		System.out.println("Sub: " + subtracao);

		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicacao: " + multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divisao: " + divisao);
	
		Integer modulo = 7 % 4;
		System.out.println("Modulo: " + modulo);
		
		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Presidencia 01: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Presidencia 02: " + precedencia02);
		
		Integer precedencia03 = 5 * (1 + 1);
		System.out.println("Presidencia 03: " + precedencia03);
	
		
		Integer precedencia04 = 5 * (1 + 1) + 2 ;
		System.out.println("Presidencia 04: " + precedencia04);
		
		Integer precedencia05 = 5 * ((1 + 1) + 2) ;
		System.out.println("Presidencia 05: " + precedencia05);
		
		Integer cinco = 5;
		Integer um = 1;
		
		Integer precedenciaComVariaveis = cinco * (um + um);
		System.out.println("Presidencia com Variaveis: " + precedenciaComVariaveis);
	}


}
