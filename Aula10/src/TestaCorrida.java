
public class TestaCorrida {
	public static void main(String[] args) {
		Corrida corrida = new Corrida();
		corrida.setData("10/04/2024");
		corrida.setHora("8:00");
		Pessoa p1 = new Pessoa("Richard Rasmussei", 21, 82, 1.73);
		Pessoa p2 = new Pessoa("Clove", 18, 52, 1.57);
		Pessoa p3 = new Pessoa("Brimstone", 54, 93, 1.84);
		
		corrida.adicionarParticipante(p1);
		corrida.adicionarParticipante(p2);
		corrida.adicionarParticipante(p3);
		
		System.out.println("Data e hora da corrida: " + corrida.dataHora());
		System.out.println("Quantidade de pessoas acima de 29 anos: " + corrida.buscaPorIdade(29));
	}
}
