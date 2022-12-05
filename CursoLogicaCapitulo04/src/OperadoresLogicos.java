
public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = false;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaloja = false;
		Boolean pagamentoAVista = true;
		
		// Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
				
		// Boolean	aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
		// Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaloja;
		
		// Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaloja;
		
		
		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaloja) && pagamentoAVista;
				
		
		if(aplicarDesconto) {
				System.out.println("Sim! Aplique o desconto.");
			} else {System.out.println("Nao aplique o desconto.");
				
			}
	}

}
