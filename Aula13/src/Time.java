import java.util.ArrayList;

public class Time {
	private String nome;
	private ArrayList<Jogador> jogadores;
	
	public Time() {
		jogadores = new ArrayList<Jogador>();
	}
	
	public Time(String nome, ArrayList<Jogador> jogadores) {
		this.nome = nome;
		this.jogadores = jogadores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	public void adicionarJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	
	public void removeJogador(String nome) {
		for(int i = 0; i < jogadores.size(); i++) {
			if(jogadores.get(i).getNome().equalsIgnoreCase(nome)) {
				jogadores.remove(i);
			}
		}
	}
	
	public int quantidadeJogadores() {
		return jogadores.size();
	}
	
	public int jogadoresSuspensos() {
		int cont = 0;
		for(int i = 0; i < jogadores.size(); i++) {
			if(jogadores.get(i).isSuspenso() == true) {
				cont++;
			}
		}
		return cont;
	}
	
	public int quantidadeCartoes() {
		int cont = 0;
		for(int i = 0; i < jogadores.size(); i++) {
			cont+= jogadores.get(i).getCartoes();
		}
		return cont;
	}
	
}
















