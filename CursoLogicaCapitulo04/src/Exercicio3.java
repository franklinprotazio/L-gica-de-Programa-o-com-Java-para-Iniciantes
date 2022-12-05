import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double total = 0.0;
		
		System.out.print("O valor da conta de luz: ");
		total += scanner.nextDouble();
		
		System.out.print("Conta de água: ");
		total += scanner.nextDouble();
		
		System.out.print("Conta de telefone: ");
		total += scanner.nextDouble();
				
		System.out.print("Escola do filho: ");
		total += scanner.nextDouble();
		
		System.out.print("Fatura do cartão: ");
		total += scanner.nextDouble();
		
		System.out.print("Gastos com supermercado: ");
		total += scanner.nextDouble();
		
	
		System.out.println("O total eh: " + total);
		
		scanner.close();
		
	}

}
