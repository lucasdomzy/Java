import java.util.Scanner;

public class Ex02 {
	public static void main (String [] args) {
		Scanner visao = new Scanner (System.in);
		double divisao, n, cont = 0, aux = 0;
		System.out.println("Informe um número real (zero para encerrar):");
		n = visao.nextDouble();
		while(n != 0) {
			aux += n;
			cont++;
			System.out.println("Informe um número real (zero para encerrar):");
			n = visao.nextDouble();
		}
		divisao = aux/cont;
		System.out.println("A média aritmética dos valores informados é: " + divisao);
	}
}
