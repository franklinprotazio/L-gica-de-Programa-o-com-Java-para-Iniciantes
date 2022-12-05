import java.util.Scanner;

public class TipoLogico {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel Falsa: " + variavelFalsa );	
		
		System.out.println("------------------------------------");
		
		System.out.println("Qual é a sua idade? ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= 18;
		
		if (podeTirarCarteira) {
			System.out.println("Sim ele pode tirar carteira.");
		}
		
		else {
			System.out.println("Nao pode");
			
			scanner.close();
		}
		

		// System.out.println(" Pode tirar carteira? " + podeTirarCarteira);
		
	}

}
