
public class Velho extends Imovel{
	private double porcentagem;
	
	public Velho() {
		
	}
	public Velho(String endereco, double preco, double porcentagem) {
		super(endereco, preco);
		this.porcentagem = porcentagem;
	}
	
	public double getPorcentagem() {
		return porcentagem;
	}
	
	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	public double valorImovelVelho() {
		double novoValor = getPreco()*(1-(porcentagem/100));
		return novoValor;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Novo [porcentagem: " + porcentagem + "Novo valor: " + valorImovelVelho() + "]";
	}
}
