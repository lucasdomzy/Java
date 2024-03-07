import java.util.Scanner;

public class EX01 {
	public static void main(String [] args) {
		Scanner ver = new Scanner(System.in);
		String palavra;
		String letra;
		System.out.println("Informe uma palavra: ");
		palavra = ver.next();
		System.out.println("Informe a letra a ser buscada: ");
		letra = ver.next();
		System.out.println("A letra " + letra + " está na posição " + palavra.indexOf(letra));
		
	}
}
