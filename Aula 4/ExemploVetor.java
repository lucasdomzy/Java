import java.util.Scanner;

public class ExemploVetor {
	public static void main(String [] args) {
		Scanner visao = new Scanner(System.in);
		int vetor[] = new int [10];
		int n;
		boolean achou = false;
		System.out.println("Preenchendo vetor");
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe um  número da posição ["+i+"]:");
			vetor[i] = visao.nextInt();
		}
		System.out.println("Informe um número a ser buscado:");
		n = visao.nextInt();
		
		for(int i = 0; i < 10; i++) {
			if(vetor[i] == n) {
				achou = true;
				break;
			}
		}
		if(achou == true) {
			System.out.println("O número está no vetor!");
		}
		else {
			System.out.println("O número não está no vetor!");
		}
		visao.close();
	}
}
