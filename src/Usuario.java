
public class Usuario {
	String nome;
	String senha;
	
	public boolean ConfirmarSenha() {
		if(senha=="123456") {
			System.out.println("Senha v�lida");
			return true;
		}else {
			System.out.println("Senha inv�lida");
			return false;
		}
	}
}
