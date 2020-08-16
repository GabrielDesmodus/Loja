
public class Vendedor extends Usuario{
	String produto;
	double quantidade;
	double preco;
	static double valorvenda;
	
	public Vendedor() {
		this.nome="Carlos Barros";
		this.senha="12345";
		this.produto = "Liquidificador";
		this.quantidade = 3;
		this.preco = 45;
	}
	
	public double TotalizarVenda() {
		valorvenda=this.quantidade*this.preco;
		return valorvenda;
	}
}
