
public class ProfessorDoutor extends Professor{
	private String instituicaoDoutorado;
	private int anoObtencaoTitulo;
	
	public ProfessorDoutor() {
		
	}
	
	public ProfessorDoutor(String nome, String cpf, String dataNascimento, String instituicaoDoutorado, int anoObtencaoTitulo, String departamento, int anoAdmissao) {
		super(nome, cpf, dataNascimento, departamento, anoAdmissao);
		this.instituicaoDoutorado = instituicaoDoutorado;
		this.anoObtencaoTitulo = anoObtencaoTitulo;
	}

	public String getInstituicaoDoutorado() {
		return instituicaoDoutorado;
	}

	public void setInstituicaoDoutorado(String instituicaoDoutorado) {
		this.instituicaoDoutorado = instituicaoDoutorado;
	}

	public int getAnoObtencaoTitulo() {
		return anoObtencaoTitulo;
	}

	public void setAnoObtencaoTitulo(int anoObtencaoTitulo) {
		this.anoObtencaoTitulo = anoObtencaoTitulo;
	}
	
	public String toString() {
		String txt = super.toString() + "\n" + "Instituição do doutorado: " + instituicaoDoutorado + "\nAno de obtenção do título: " + anoObtencaoTitulo;
		
		return txt;
	}
}
