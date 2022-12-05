import java.util.Scanner;

public class RecebendoParametros {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			imprimirTraco();
			
			String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avancado"};
			
			System.out.println("Escola dentre os cursos abaixo: ");
			
			for(int i = 0; i < cursos.length; i++) {
				System.out.println("[" + i + " ]" + cursos[i]);
			}
			
			System.out.print("O curso que voce deseja eh o: ");
			Integer posicaoCursoEscolhido = scanner.nextInt();
			
			Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
			
			if(!posicaoValida) {
				imprimirPosicaoInvalida();
			}
			
			imprimirTraco();
			
			String[] formasPagamento = new String[] {"Cartao", "Boleto"};
			
			System.out.println("Escolha dentre as formas de pagamento abaixo: ");
			
			for(int i = 0; i < formasPagamento.length; i++) {
				System.out.println("[" + i + "]" + formasPagamento[i]);
			}
			
			System.out.print("A forma de pagamento escolhida eh: ");
			Integer posicaoFormasPagamentoEscolhida = scanner.nextInt();
			
			posicaoValida = posicaoFormasPagamentoEscolhida >= 0 && posicaoFormasPagamentoEscolhida < formasPagamento.length;
			
			if(!posicaoValida) {
				imprimirPosicaoInvalida();
				
			}
			
			
			String cursoEscolhido = cursos[posicaoCursoEscolhido];
			String formaPagamentoEscolhida = formasPagamento[posicaoFormasPagamentoEscolhida];
			
			imprimirTraco();
			
			System.out.println("O curso escolhido foi: " + cursoEscolhido);
			System.out.println("A forma de pagamento escolhida foi: " + formaPagamentoEscolhida);
			
			scanner.close();
		}
		
		static void imprimirTraco() {
			System.out.println("--------------------------------------------------------");
		}
			
		static void imprimirPosicaoInvalida() {
			System.err.println("Posicao invalida!");
			System.exit(1);
			
		
	}
}
