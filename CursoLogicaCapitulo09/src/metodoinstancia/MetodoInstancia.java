package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Franklin";
		cliente.ultimoNome = "Protazio";
		cliente.telefone = "110000000";
		cliente.email = "franklin@protazio.com.br";
		
		Cliente cliente2 = new Cliente(); 
		cliente2.primeiroNome = "Mady";
		cliente2.ultimoNome = "Protazio";
		cliente2.telefone = "071992015723";

		System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());

	}

}