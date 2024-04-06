
public class TestaHerança {
	public static void main(String [] args) {
		Pessoa p = new Pessoa();
		p.setNome("Andressa Neves");
		p.setCpf("234.145.657-14");
		p.setDataNascimento("17/03/2006");
		
		System.out.println("Dados da pessoa: \n" + p.toString()+ "\n---------------------");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Alessandro dos Santos Ribeiro");
		p2.setCpf("071.765.561-43");
		p2.setDataNascimento("20/03/2003");
		
		System.out.println("Dados da pessoa: \n" + p2.toString() + "\n---------------------");
		
		
		Aluno al = new Aluno();
		al.setNome("Cleber Fonseca Rocha");
		al.setCpf("532.765.144-90");
		al.setDataNascimento("05/07/1997");
		al.setCurso("Odontologia");
		al.setAnoIngresso(2023);
		System.out.println("Dados do aluno: \n" + al.toString() + "\n---------------------");
		
		Professor prof = new Professor();
		prof.setNome("Gilberto Rodrigues");
		prof.setCpf("867.123.867-87");
		prof.setDataNascimento("08/12/1967");
		prof.setDepartamento("Desenvolvimento de Software");
		prof.setAnoAdmissao(2010);
		
		System.out.println("Dados do professor: \n" + prof.toString() + "\n---------------------");
		
		ProfessorDoutor profD = new ProfessorDoutor();
		profD.setNome("Gilberto Rodrigo da Silva");
		profD.setCpf("564.756.810-54");
		profD.setDataNascimento("10/10/1978");
		profD.setDepartamento("Desenvolvimento Web");
		profD.setAnoAdmissao(2007);
		profD.setAnoObtencaoTitulo(2005);
		profD.setInstituicaoDoutorado("Universidade Federal do Paraná");
		
		System.out.println("Dados do Doutor: \n" + profD.toString() + "\n");
		
	}
}
