
public class Assalariado extends Empregado{
	private double salario;
	
	public Assalariado() {
		
	}
	
	public Assalariado(String nome, String cpf, String setor, double salario) {
		super(nome, cpf, setor);
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return super.toString() + "Salario: " + salario + "\n";
 	}
}
