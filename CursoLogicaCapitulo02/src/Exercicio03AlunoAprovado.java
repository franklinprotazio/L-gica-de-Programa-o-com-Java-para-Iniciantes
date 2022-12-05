import java.util.Scanner;

public class Exercicio03AlunoAprovado {
	
	static final Integer MEDIA_PARA_APROVACAO = 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Boolean alunoAprovado = true;
		
		Boolean alunoReprovado = false;
		
		System.out.println("Qual é a nota da primeira unidade? ");
		Double notaPrimeiraUnidade = scanner.nextDouble();
		
		System.out.println("Qual é a nota da segunda unidade? ");
		Double notaSegundaUnidade = scanner.nextDouble();
		
		System.out.println("Qual é a nota da terceira unidade? ");
		Double notaTerceiraUnidade = scanner.nextDouble();
		
		System.out.println("Qual é a nota da quarta unidade? ");
		Double notaQuartaUnidade = scanner.nextDouble();
		
		Double notaAluno = (notaPrimeiraUnidade + notaSegundaUnidade + notaTerceiraUnidade + notaQuartaUnidade) / 4;
		
		Boolean aprovacao = notaAluno >= MEDIA_PARA_APROVACAO;
		
		System.out.println("A sua media é " + notaAluno);
		
		if (aprovacao) {
			System.out.println("Aluno Aprovado");
		}
		
		else {
			System.out.println("Aluno Reprovado");
		}
		
		scanner.close();
	}

}
