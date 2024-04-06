
public class Pessoa {
	protected String nome;
	protected String cpf;
	protected String dataNascimento;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		String txt = "Nome: " + nome + "\n" + 
				"CPF: " + cpf + "\n" +
				"Data de Nascimento: " + dataNascimento;
		
		return txt;
	}
}
