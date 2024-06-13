
public class Produto {
private String nome;
	private double valorUnitario;
	private double quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double valorUnitario, int quantidade) {
		this.nome = nome;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nValor da unidade: " + valorUnitario + "\nQuantidade em estoque: " + quantidade + "\n";
	}
}
