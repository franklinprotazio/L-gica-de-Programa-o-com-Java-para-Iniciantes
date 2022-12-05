import java.util.Scanner;

public class Recursividade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avancado" };

		imprimir("Escolha dentre os cursos abaixo: ");

		interarEExebirPosicoesDoVetorString(cursos);

		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que voce deseja eh o: ", scanner);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos); // posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartao", "Boleto" };

		imprimir("Escolha dentre as formas de pagamento abaixo: ");

		interarEExebirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormasPagamentoEscolhida = receberNumeroInteiroDoUsuario("A forma de pagamento escolhida eh: ", scanner);

		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormasPagamentoEscolhida, formasPagamento); // posicaoFormasPagamentoEscolhida >= 0
//				&& posicaoFormasPagamentoEscolhida < formasPagamento.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();

		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormasPagamentoEscolhida];

		imprimirTraco();

		imprimir("O custo escolhido foi: " + cursoEscolhido + " e a forma de pagamento escolhida foi: "
				+ formaPagamentoEscolhida);

		scanner.close();
	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		
		return numero;
		
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}

	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

	static void imprimir(String texto) {
		System.out.println(texto);
	}

	static void interarEExebirPosicoesDoVetorString(String[] vetor) {
		interarEExebirPosicoesDoVetorString(vetor, 0);
	}
	
	static void interarEExebirPosicoesDoVetorString(String[] vetor, Integer i) {
		imprimir("[" + i + "] " + vetor[i]);
		
		if(++i < vetor.length) {
			interarEExebirPosicoesDoVetorString(vetor, i);
		}
	}
	
	

	static void imprimirTraco() {
		imprimir("--------------------------------------------------------");
	}

	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posicao invalida!");
		System.exit(1);

	}
	
}