import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu peso :");
		Double pesoDigitado = scanner.nextDouble();
		
		System.out.print("Digite a sua altura ");
		Double alturaDigitada = scanner.nextDouble();
		
		Double imc = pesoDigitado / (alturaDigitada * alturaDigitada);
		
		System.out.println("O seu IMC é " + imc);
		
		scanner.close();
	}

}





