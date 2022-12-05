import java.util.Scanner;

public class Exercicio2 {
	
	static final Integer FRETE_GRATIS = 100;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer frete = 15;
		
		System.out.print("Valor do produto: ");
		Integer valorDoProduto = scanner.nextInt();
		
		Integer resultado = valorDoProduto + frete;
		
		if(resultado >= FRETE_GRATIS) {
			System.out.println("Valor total da compra: " + resultado + " + Frete gratis");
		}
		
		else {
			System.out.println("Valor total da compra: " + valorDoProduto + " + Frete - Total: " + (valorDoProduto + frete));
		}
		
		
		
		
		
		
		
		scanner.close();
	}

}
