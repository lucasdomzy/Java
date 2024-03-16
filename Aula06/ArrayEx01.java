import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx01 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<String>();
		String nome;
		System.out.println("Informe um nome (Fim para finalizar)");
		nome = sc.nextLine();
		while(!nome.equalsIgnoreCase("fim")) {
			nomes.add(nome.toLowerCase());
			System.out.println("Informe um nome (Fim para finalizar)");
			nome = sc.nextLine();
		}
		System.out.println("Informe o nome a ser buscado:");
		nome = sc.nextLine();
		if(nomes.contains(nome.toLowerCase())) {
			System.out.println("O ArrayList contém o nome!" + " que está na posição " + nomes.indexOf(nome.toLowerCase()));
		}
		else {
			System.out.println("O ArrayList não contém o nome!");
		}
		System.out.println("Nomes contidos no ArrayList:");
		System.out.println(nomes.toString());
		System.out.println("Informe um nome a ser removido:");
		nome = sc.nextLine();
		nomes.remove(nome.toLowerCase());
		System.out.println("Lista com o nome removido:");
		System.out.println(nomes.toString());
		sc.close();
	}
}
