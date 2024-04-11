
public class Novo extends Imovel{
	private double porcentagem;
	
	public Novo() {
		
	}
	public Novo(String endereco, double preco, double porcentagem) {
		super(endereco, preco);
		this.porcentagem = porcentagem;
	}
	public double getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	public double valorImovelNovo() {
		double novoValor = getPreco()*(1+(porcentagem/100));
		return novoValor;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Novo [porcentagem = " + porcentagem + "Novo atualizado: " + valorImovelNovo() + "]";
	}
}
