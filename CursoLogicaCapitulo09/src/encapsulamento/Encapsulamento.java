package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		
//		cliente.nome = "Franklin";
//		cliente.telefone ="71992015723";
//		
//		System.out.println("Nome cliente: " + cliente.nome);
		
		Cliente cliente = new Cliente();
		
				
		cliente.setNome("Franklin Protazio");
		cliente.setTelefone("71992015723");
		
		System.out.println("Nome cliente: " + cliente.getNome() );
		System.out.println("Primeiro nome : " + cliente.getPrimeiroNome() );
		System.out.println("Ultimo nome : " + cliente.getUltimoNome() );
		
		
	}

}