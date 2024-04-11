
public class Horista extends Empregado{
	private double qntHoras;
	private double valorHora;
	
	public Horista() {
		
	}
	
	public Horista(String nome, String cpf, String setor, double qntHoras, double valorHora) {
		super(nome, cpf, setor);
		this.qntHoras = qntHoras;
		this.valorHora = valorHora;
	}

	public double getQntHoras() {
		return qntHoras;
	}

	public void setQntHoras(double qntHoras) {
		this.qntHoras = qntHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public String toString() {
		return super.toString() + "Quantidade de horas: " + qntHoras + "\nValor da hora: " + valorHora + "\n";
	}
}
