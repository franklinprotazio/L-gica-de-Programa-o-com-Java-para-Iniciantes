import java.util.Scanner;

public class Exercicio4 {
	
	static final Integer IDADE_PREVIDENCIA = 55;
	static final Integer TEMPO_CONTRIBUICAO = 25;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Boolean previdenciaAprovada = true;
		Boolean tempoContribuicao = true;
		
		System.out.print("Qual eh a sua idade? ");
		Integer idadeDigitada = scanner.nextInt();
		
		System.out.print("Quanto tempo de contribuicao? ");
		Integer tempoContribuicaoDigitada = scanner.nextInt();
		
		previdenciaAprovada = idadeDigitada >= IDADE_PREVIDENCIA;
		
		tempoContribuicao = tempoContribuicaoDigitada >= TEMPO_CONTRIBUICAO;
		
		Boolean aposentadoriaAprovada = previdenciaAprovada && tempoContribuicao;
		
		if(aposentadoriaAprovada) {
			System.out.println("Pode Aposentar");
			
		} else {
			System.out.println("Nao pode aposentar");
		}
	
		
		scanner.close();
	}

}
