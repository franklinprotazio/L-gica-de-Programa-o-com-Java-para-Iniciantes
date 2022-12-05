import java.util.Scanner;

public class Exercicio02NomeSobrenome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual eh o seu nome? ");
		String nome = scanner.nextLine();
		
		System.out.println("Qual eh o seu sobrenome? ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Voce se chama " + nome + " " + sobrenome);
		
		scanner.close();
	}

}
