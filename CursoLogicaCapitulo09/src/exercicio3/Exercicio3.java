package exercicio3;

public class Exercicio3 {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		
		pedido.codigo = 10;
		
		pedido.desconto = 20;
		
		pedido.subtotal = 150.0;
		
//		pedido.total = 100.0;
		
		System.out.println("Codigo: " + pedido.getCodigo() + ", Subtotal: " + pedido.getSubtotal() + 
				", Desconto: " + pedido.getDesconto() + ", Total: " + pedido.getTotal());
	}

}
