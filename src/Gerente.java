
public class Gerente extends Vendedor{
	int desconto;
	double valordesconto;
	
	public Gerente() {
		this.nome="Eurico Gomes";
		this.senha="12345";
		this.desconto=5;
	}
	
	public double ConcederDesconto() {
		this.valordesconto=valorvenda*this.desconto/100;
		return this.valordesconto;
	}
}
