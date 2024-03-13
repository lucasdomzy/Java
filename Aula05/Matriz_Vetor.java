import java.util.Scanner;

public class Matriz_Vetor {
	public static void main(String [] args) {
		
		Scanner visao = new Scanner(System.in);
		
		int matriz [][] = new int [3][3];
		
		int vetor[] = new int [3];
		
		for(int i = 0; i < 3; i++) {
			for(int col = 0; col < 3; col++) {
				System.out.println("Informe o valor da posiçõa [" + i +"]["+ col +"]:");
				 matriz[i][col]= visao.nextInt();
			}
		}
		for(int col = 0; col < 3; col++) {
			for(int i = 0; i < 3; i++) {
				vetor[col] += matriz[i] [col];
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.println("["+i+"]:" + vetor[i]);
		}
	}
}
