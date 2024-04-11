
public class TesteImovel {
	public static void main(String [] args) {
		Imovel im = new Imovel();
		im.setEndereco("Rua Almeida Machado 2245");
		im.setPreco(450000);
		
		System.out.println("Imóvel da " + im.getEndereco() + "\nValor: R$" + im.getPreco());
		
		Novo nI = new Novo();
		nI.setEndereco("Avenida dos Inventores Gudan Neves 345");
		nI.setPreco(600000);
		nI.setPorcentagem(5);
		
		System.out.println("Imóvel da " + nI.getEndereco() + "\nValor: R$" + nI.valorImovelNovo());
		
		Velho vI = new Velho();
		vI.setEndereco("Rua João Assis Santos Arruda");
		vI.setPreco(500000);
		vI.setPorcentagem(10);
		
		System.out.println("Imóvel da " + vI.getEndereco() + "\nValor: R$" + vI.valorImovelVelho());
	}
}
