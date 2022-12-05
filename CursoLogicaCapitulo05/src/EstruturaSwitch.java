import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o mes: ");
		Integer mesDigitado = scanner.nextInt();
		
		Double desconto = 0.0;
		
		
		switch(mesDigitado) {
		case 1: desconto = 0.0;
			break;
		case 2: desconto = 0.0;
			break;
		case 3: desconto = 15.0;
			break;
		case 4: desconto = 30.0;
			break;	
		case 5: desconto = 30.0;
			break;
		case 6: desconto = 10.0;
			break;
		case 7: desconto = 10.0;
			break;
		case 8: desconto = 10.0;
			break;
		case 9: desconto = 10.0;
			break;
		case 10: desconto = 20.0;
			break;
		case 11: desconto = 10.0;
			break;
		case 12: desconto = 0.0;
			break;
		default:
			System.err.println("Digite um mes valido!");
			System.exit(1);
		}
		
		
		System.out.println("Seu desconto sera de: " + desconto + "%");
		scanner.close();

	}

}
