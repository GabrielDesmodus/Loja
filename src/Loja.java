
public class Loja{
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Vendedor vendedor = new Vendedor();
		if(cliente.ConfirmarSenha()) {
			
		}
		if(vendedor.ConfirmarSenha()) {
			System.out.println(vendedor.TotalizarVenda());
		}
	}
}
