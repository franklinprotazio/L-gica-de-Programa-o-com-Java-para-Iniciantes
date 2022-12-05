import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double primeiroNumeroDigitado = imprimirNaMesmaLinha("Digite um numero: ", scanner);
		
		imprimirTraco();

		Integer operadorSelecionado = escolhaOperacao(scanner);
		
		imprimirTraco();

		Double segundoNumeroDigitado = imprimirNaMesmaLinha("Digite um numero: ", scanner);

		imprimirTraco();
		
		Double resultado = calculandoOperacao(operadorSelecionado, primeiroNumeroDigitado, segundoNumeroDigitado);
		
//		imprimirTraco();
		
		System.out.println("O resultado eh: " + resultado);

		scanner.close();
	}

	static Double imprimirNaMesmaLinha(String texto, Scanner scanner) {
		System.out.print(texto);
		return scanner.nextDouble();
	}
	
	static void imprimirTraco() {
		System.out.println("----------------------------------");
	}

	static void imprimir(String texto) {
		System.out.println(texto);
	}

	static Integer escolhaOperacao(Scanner scanner) {	
		imprimir("Escolha uma operacao");
		
		String[] operacoes = new String [] {"Adicao", "Subtracao", "Multiplicacao", "Divisao"};
		
		for(int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + (i + 1) + "]" + operacoes[i]);
		}
		
		System.out.print("Digite a operacao: ");
		
		return scanner.nextInt();
	}
	
	static Double calculandoOperacao(Integer operador, Double primeiroNumeroDigitado, Double segundoNumeroDigitado) {
		Double resultado = null;

		switch (operador) {
		case 1:
			resultado = adicao (primeiroNumeroDigitado, segundoNumeroDigitado);
			break;
		case 2:
			resultado = subtracao (primeiroNumeroDigitado, segundoNumeroDigitado);
			break;
		case 3:
			resultado = multiplicacao(primeiroNumeroDigitado, segundoNumeroDigitado);
			break;
		case 4:
			resultado = divisao (primeiroNumeroDigitado, segundoNumeroDigitado);
			break;
		default:
			System.err.println("Escolha uma operação válida!");
			System.exit(0);
		}

		return resultado;
	}
	
	static Double adicao (Double primeiroNumeroDigitado, Double segundoNumeroDigitado) {
		return primeiroNumeroDigitado + segundoNumeroDigitado;
	}
	
	static Double subtracao (Double primeiroNumeroDigitado, Double segundoNumeroDigitado) {
		return primeiroNumeroDigitado - segundoNumeroDigitado;
	}
	
	static Double multiplicacao (Double primeiroNumeroDigitado, Double segundoNumeroDigitado) {
		return primeiroNumeroDigitado * segundoNumeroDigitado;
	}
	
	static Double divisao (Double primeiroNumeroDigitado, Double segundoNumeroDigitado) {
		return primeiroNumeroDigitado / segundoNumeroDigitado;
	}

}
