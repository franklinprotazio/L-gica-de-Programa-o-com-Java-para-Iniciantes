package exercicio2;

public class Exercicio02 {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Camisa";
		produto.quantidadeEstoque = 8;
		
		System.out.println("Necessario repor estoque do produto " + produto.nome + "? " + validarQuantidadeMinima(produto));
	}
	
	static Boolean validarQuantidadeMinima(Produto produto) {
		if(produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		return false;
	}

}
