import java.util.Scanner;

public class Ex04 {
	public static void main (String [] args) {
		Scanner visao = new Scanner(System.in);
		
		int vetor[] = new int [10];
		int n;
		boolean achou = false;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe o "+i+"° número:");
			vetor[i] = visao.nextInt();
		}
		System.out.println("Informe o valor a ser buscado:");
		n = visao.nextInt();
		for(int i = 0; i < 10; i++) {
			if(vetor[i] == n) {
				achou = true;
			}
			if(achou = true) {
				System.out.println("O número aparece nas posições: " + i);
			}
		}
		
	}
}
