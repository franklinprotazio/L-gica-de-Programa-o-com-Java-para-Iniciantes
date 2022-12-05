import java.util.Scanner;

public class Exercicio01 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			imprimirTraco();
			
			String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avancado"};
			
			System.out.println("Escola dentre os cursos abaixo: ");
			
			interarEExebirPosicoesDoVetorString(cursos);
			
			System.out.print("O curso que voce deseja eh o: ");
			Integer posicaoCursoEscolhido = scanner.nextInt();
			
			Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
			
			if(!posicaoValida) {
				encerrarProgramaPorCausaDaPosicaoInvalida();
			}
			
			imprimirTraco();
			
			String[] formasPagamento = new String[] {"Cartao", "Boleto"};
			
			System.out.println("Escolha dentre as formas de pagamento abaixo: ");
			
			interarEExebirPosicoesDoVetorString(formasPagamento);
			
			System.out.print("A forma de pagamento escolhida eh: ");
			Integer posicaoFormasPagamentoEscolhida = scanner.nextInt();
			
			posicaoValida = posicaoFormasPagamentoEscolhida >= 0 && posicaoFormasPagamentoEscolhida < formasPagamento.length;
			
			if(!posicaoValida) {
				encerrarProgramaPorCausaDaPosicaoInvalida();
				
			}
			
			
			String cursoEscolhido = cursos[posicaoCursoEscolhido];
			String formaPagamentoEscolhida = formasPagamento[posicaoFormasPagamentoEscolhida];
			
			imprimirTraco();
			
			System.out.println("O curso escolhido foi: " + cursoEscolhido);
			System.out.println("A forma de pagamento escolhida foi: " + formaPagamentoEscolhida); 
			
			scanner.close();
		}
		
			
		static void interarEExebirPosicoesDoVetorString(String[] vetor) {
			for(int i = 0; i < vetor.length; i++) {
//				System.out.println("[" + i + " ]" + vetor[i]);
				System.out.println(i + ". " + vetor[i]);
			}
		}
		
		
		static void imprimirTraco() {
			System.out.println("--------------------------------------------------------");
		}
			
		static void encerrarProgramaPorCausaDaPosicaoInvalida() {
			System.err.println("Posicao invalida!");
			System.exit(1);
			
		
	}
}
