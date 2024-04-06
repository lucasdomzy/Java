
public class Professor extends Pessoa{
	private String departamento;
	private int anoAdmissao;
	
	public Professor() {
		
	}
	
	public Professor(String nome, String cpf, String dataNascimento, String departamento, int anoAdmissao) {
		super(nome, cpf, dataNascimento);
		this.departamento = departamento;
		this.anoAdmissao = anoAdmissao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getAnoAdmissao() {
		return anoAdmissao;
	}

	public void setAnoAdmissao(int anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}
	
	public String toString() {
		String txt = super.toString() + "\n" + "Departamento: " + departamento + "\nAno de Admissão: " + anoAdmissao;
		
		return txt;
	}
}
