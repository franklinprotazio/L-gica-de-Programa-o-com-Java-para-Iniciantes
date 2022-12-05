import java.util.Scanner;

public class Exercicio2 {

	static final Double META_DE_FATURAMENTO_ANUAL = 100000.0;
	static final Double META_MINIMA_FATURAMENTO_ANUAL = 80000.0;
	static final Double SALARIO_FUNCIONARIOS = 1000.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o faturamento anual de 2022: ");
		Double faturamentoAnual = scanner.nextDouble();
		
		Boolean faturamentoReal = faturamentoAnual >= META_DE_FATURAMENTO_ANUAL;
		Boolean faturamentoMaiorOuIgual80 = (faturamentoAnual <= META_DE_FATURAMENTO_ANUAL) && (faturamentoAnual >= META_MINIMA_FATURAMENTO_ANUAL);
		
		
		if (faturamentoReal) {
			Double bonusSalarioFuncionarios = (SALARIO_FUNCIONARIOS * 100) / 100 + SALARIO_FUNCIONARIOS;
			System.out.println("O bonus salarial eh " + bonusSalarioFuncionarios);
		} else if (faturamentoMaiorOuIgual80) {
			Double bonusSalarioFuncionarios = (SALARIO_FUNCIONARIOS * 80) / 100 + SALARIO_FUNCIONARIOS;
			System.out.println("O bonus salarial eh " + bonusSalarioFuncionarios);
		} else {
			System.out.println("Infelizmente ninguem recebera nenhum bonus");
		}
		
		
		scanner.close();

	}

}
