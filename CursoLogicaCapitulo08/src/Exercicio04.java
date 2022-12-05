import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um numero ");
		Integer multiplicando = scanner.nextInt();

		imprimirTabuada(multiplicando, 0);

		scanner.close();
	}

	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {

		Integer resultado = multiplicando * multiplicador;

		System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);

		if (multiplicador < 10) {
			imprimirTabuada(multiplicando, ++multiplicador);

		}

	}

}