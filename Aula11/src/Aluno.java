
public class Aluno extends Pessoa{
	private String curso;
	private int anoIngresso;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String cpf, String dataNascimento, String curso, int anoIngresso) {
		super(nome, cpf, dataNascimento);
		this.curso = curso;
		this.anoIngresso = anoIngresso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	public String toString() {
		String txt = super.toString() + "\n" + 
					"Curso: " + curso + "\n" +
					"Ano de ingresso: " + anoIngresso;
		
		return txt;
	}
}
