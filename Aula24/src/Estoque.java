import java.util.HashMap;

public class Estoque {
private HashMap<Integer, Produto> produtos;
	
	public Estoque() {
		produtos = new HashMap<Integer, Produto>();
	}
	
	public Estoque(HashMap<Integer, Produto> produtos) {
		this.produtos = produtos;
	}
	
	public HashMap<Integer, Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(HashMap<Integer, Produto> produtos) {
		this.produtos = produtos;
	}

	public void addProduto(Produto p) {
		int chave = produtos.size();
		produtos.put(chave, p);
	}
	
	public void removerProduto(Integer id) {
		if(produtos.containsKey(id)) {
			produtos.remove(id);
		}
	}
	
	public double calcularValorEstoque() {
		double valor = 0;
		for (int key: produtos.keySet()) {
			valor += produtos.get(key).getQuantidade()*produtos.get(key).getValorUnitario();
		}
		return valor;
	}
	
	public void receberMercadoria(int id, double qnt) {
		if(produtos.containsKey(id)) {
			Produto p = produtos.get(id);
			produtos.get(id).setQuantidade(p.getQuantidade()+qnt);
			//Produto p = produtos.get(id);
			//p.setQuantidade(p.getQuantidade()+qnt);
			//produtos.replace(id, p);
		}
	}	
	public void retirarMercadoria(int id, double qnt) {
		if(produtos.containsKey(id)) {
			if(produtos.get(id).getQuantidade() >= qnt) {
				Produto p = produtos.get(id);
				p.setQuantidade(p.getQuantidade()+qnt);
				produtos.replace(id, p);			}
			}
	}
	
	public double verificarQntProduto(int id) {
		if(produtos.containsKey(id)) {
			return produtos.get(id).getQuantidade();
		}
		else {
			return -1;
		}
	}
	
	public void imprimirProdutos() {
		for (int id: produtos.keySet()) {
			System.out.println(id);
			System.out.println(produtos.get(id).toString());
		}
	}
}
