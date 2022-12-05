import java.util.Scanner;

public class Exercício01CalculandoQuadrado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		Integer valorDigitado = scanner.nextInt();
		
		Integer resultado = valorDigitado * valorDigitado;
		
		System.out.println(resultado);
		
		scanner.close();
			
	
	}
	
}
