import java.util.Scanner;

public class Exercicio03Teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		imprimirNaMesmaLinha("Digite um numero: ");

		Integer primeiroNumeroDaOperacao = numeroDigitadoPeloUsuario("", scanner);

		String[] operadorMatematico = new String[] { "+", "-", "*", "/" };

		imprimir("Escolha um operador");
		
		interarEExebirOperadoresMatematico(operadorMatematico);
		
		Integer operadorMatematicoEscolhido = numeroDigitadoPeloUsuario(": ", scanner);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(operadorMatematicoEscolhido, operadorMatematico);
		
		if(!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();			
		}
		
		imprimirNaMesmaLinha("Digite outro numero: ");
		
		Integer segundoNumeroDaOperacao = numeroDigitadoPeloUsuario("", scanner);
		
//		Integer resultado = calculandoOperacao(primeiroNumeroDaOperacao, operadorMatematico[operadorMatematicoEscolhido], segundoNumeroDaOperacao);//

		scanner.close();

	}

	static void imprimirTraco() {
		imprimir("-----------------------------------");
	}

	static void imprimirNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

	static void imprimir(String texto) {
		System.out.println(texto);
	}

	static Integer numeroDigitadoPeloUsuario(String texto, Scanner scanner) {
		imprimirNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		return numero;
	}
	
	static void interarEExebirOperadoresMatematico(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			imprimir(i + " = " + vetor[i] );
		}
			
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posivao Invalida");
		System.exit(1);
	}
	
	static Integer calculandoOperacao(Integer primeiroNumero, String[] vetor, Integer segundoNumero) {
		imprimir("A soma entre os valores eh:aaaaaaaaaaaaaa ");
		Integer resultado = (null); 
		if(vetor.length == 0) {
			resultado = primeiroNumero + segundoNumero;
			imprimir("A soma entre os valores eh: " + resultado);
		}
		
//		switch (vetor.length) {
//		case 0:
//			resultado = primeiroNumero + segundoNumero;
//			imprimir("A soma entre os valores eh: " + resultado);
//			break;
//		}
		
		return resultado;				
	}
}

