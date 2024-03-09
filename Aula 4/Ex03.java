import java.util.Scanner;

public class Ex03 {
	public static void main(String [] args) {
		Scanner visao = new Scanner (System.in);
		int vetor [] = new int [10];
		boolean achou = false;
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe o "+i+"° número:");
			vetor[i] = visao.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			if(vetor[i] % 2 == 0) {
				achou = true;
				if(achou == true) {
					System.out.println("Número par na pasição: " + i);
				}
			}
		}
		visao.close();
	}
}
