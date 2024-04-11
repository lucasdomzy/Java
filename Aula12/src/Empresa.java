import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String cnpj;
	private ArrayList<Empregado>empregados;
	
	public Empresa() {
		empregados = new ArrayList<Empregado>();
	}
	public Empresa(String nome, String cnpj, ArrayList<Empregado> empregados) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.empregados = empregados;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public ArrayList<Empregado> getEmpregados() {
		return empregados;
	}
	public void setEmpregados(ArrayList<Empregado> empregados) {
		this.empregados = empregados;
	}
}
