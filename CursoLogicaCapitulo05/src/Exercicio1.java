import java.util.Scanner;

public class Exercicio1 {
	
	static final Integer NOTA_MINIMA_DE_APROVACAO = 150;
	static final Integer NOTA_MINIMA = 60;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Qual eh a sua nota em portugues? ");
		Integer notaDigitadaDePortugues = scanner.nextInt();
		
		System.out.print("Qual eh a sua nota em matematica? ");
		Integer notaDigitadaDeMatematica = scanner.nextInt();
		
		Boolean notaDeAprovacao = (notaDigitadaDePortugues + notaDigitadaDeMatematica) >= NOTA_MINIMA_DE_APROVACAO;
		Boolean notaDeAprovacaoDePortugues = notaDigitadaDePortugues >= NOTA_MINIMA;
		Boolean notaDeAprovacaoDeMatematica = notaDigitadaDeMatematica >= NOTA_MINIMA;
		
		Boolean aprovado = notaDeAprovacao && notaDeAprovacaoDePortugues && notaDeAprovacaoDeMatematica;
		
		if(aprovado) {
			System.out.println("O candidato foi aprovado");
		} else {
			System.out.println("O canditado n foi aprovado");
		}
		
		
				
		scanner.close();
	}

}
