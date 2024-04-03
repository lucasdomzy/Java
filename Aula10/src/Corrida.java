
public class Corrida {
	private String data;
	private String hora;
	private Pessoa participantes[];
	
	public Corrida() {
		participantes = new Pessoa[10];
	}
	
	public Corrida(String data, String hora, Pessoa participantes[]) {
		this.data = data;
		this.hora = hora;
		this.participantes = participantes;
	}
	public String getData(){
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public Pessoa[] getParticipantes() {
		return participantes;
	}
	
	public void setParticipantes(Pessoa[] participantes) {
		this.participantes = participantes;
	}
	
	public int adicionarParticipante(Pessoa participante) {
		for(int i = 0; i < 10; i++) {
			if(participantes[i] == null) {
				participantes[i] = participante;
				return i;
			}
		}
		
		return -1;
	}
	
	public String dataHora(){
		return data + " " + hora;
	}
	
	public int buscaPorIdade(int idade) {
		int cont =0;
		for(int i = 0; i < 10; i++) {
			if(participantes[i] != null) {
				if(participantes[i].getIdade() > idade) {
					cont++;
				}
			}
		}
		return cont;
	}
	
	public int buscaPorIMC() {
		int cont = 0;
		
		for(int i = 0; i < 10; i++) {
			if(participantes[i] != null) {
				double imc = participantes[i].getPeso()/Math.pow(participantes[i].getAltura(), 2);
				if(imc > 18.5 && imc < 24.9) {
					cont++;
				}
			}
		}
		
		return cont;
	}
}
