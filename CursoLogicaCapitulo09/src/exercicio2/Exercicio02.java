package exercicio2;

public class Exercicio02 {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Camisa";
		produto.quantidadeEstoque = 8;
		
		System.out.println("Necessario repor estoque do produto " + produto.nome + "? " + produto.validarQuantidadeMinima());
	}
}
