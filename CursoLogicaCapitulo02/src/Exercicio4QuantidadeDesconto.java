import java.util.Scanner;

public class Exercicio4QuantidadeDesconto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorDigitado = scanner.nextDouble();
		
		System.out.print("Digite a quantidade desejada: ");
		Integer quantidadeDigitada = scanner.nextInt();
		
		Double subtotal = valorDigitado * quantidadeDigitada;
		System.out.println("O subtotal eh: " + subtotal);
		
		Boolean quantidadeComDesconto = quantidadeDigitada.equals(10);
		
		Double quantidadeMinima = 0.0;
		
		if(quantidadeComDesconto) {
				quantidadeMinima = 10.0;
		}
		
		
		Double desconto = subtotal * quantidadeMinima / 100;
		
		Double total = subtotal - desconto;
		
		System.out.println("O valor a ser pago com desconto eh " + total);
		
		scanner.close();
	}

}
