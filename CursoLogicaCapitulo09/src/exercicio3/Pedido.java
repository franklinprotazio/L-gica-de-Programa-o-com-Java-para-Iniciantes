package exercicio3;

public class Pedido {
	
	Integer codigo;
	
	Double subtotal;
	
	Integer desconto;
	
//	Double total;
	
	Integer getCodigo() {
		return codigo;
	}
	
	void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	Double getSubtotal() {
		return subtotal;
	}

	void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	Integer getDesconto() {
		return desconto;
	}

	void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}

	Double getTotal() {
		return subtotal - desconto;
	}

	void setTotal(Double total) {
//		this.total = total;
	}
		
	
	
}
