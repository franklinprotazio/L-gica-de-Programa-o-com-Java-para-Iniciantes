import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero ");
		Integer numeroDigitado = scanner.nextInt();
		
		String diaDaSemana = "";
		
		switch(numeroDigitado) {
	
		case 1: diaDaSemana = "Domingo";
			break;
		case 2: diaDaSemana = "Segunda";
			break;
		case 3: diaDaSemana = "Terca";
			break;
		case 4: diaDaSemana = "Quarta";
			break;
		case 5: diaDaSemana = "Quinta";
			break;
		case 6: diaDaSemana = "Sexta";
			break;
		case 7: diaDaSemana = "Sabado";
			break;
		default:
		System.err.println("Digite um dia valido!");
			System.exit(1);
			
		}	
		
		System.out.println("O dia escolhido foi " + diaDaSemana);
		scanner.close();
	}

}
