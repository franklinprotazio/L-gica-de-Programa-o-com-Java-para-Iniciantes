import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		Integer primeiroNumeroDigitado = scanner.nextInt();
		
		System.out.print("Escolha qual operador - [1] = + | [2] = - | [3] = * | [4] = / : ");
		Integer operadorSelecionado = scanner.nextInt();
		
		System.out.print("Digite um numero: ");
		Integer segundoNumeroDigitado = scanner.nextInt();
		

		Integer resultado;
		
		if(operadorSelecionado == 1) {
			resultado = primeiroNumeroDigitado + segundoNumeroDigitado;
			System.out.println("A soma entre os valores eh: " + resultado);
			
		}
		
		if(operadorSelecionado == 2) {
			resultado = primeiroNumeroDigitado - segundoNumeroDigitado;
			System.out.println("A subtracao entre os valores eh: " + resultado);
			
		}
		
		if(operadorSelecionado == 3) {
			resultado = primeiroNumeroDigitado * segundoNumeroDigitado;
			System.out.println("A multiplicacao entre os valores eh: " + resultado);
			
		}
		
		if(operadorSelecionado == 4) {
			resultado = primeiroNumeroDigitado / segundoNumeroDigitado;
			System.out.println("A divisao entre os valores eh: " + resultado);
			
		}
			
		
	scanner.close();
	}

}
