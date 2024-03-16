import java.util.Scanner;

public class Matriz01 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int matriz [][] = new int [5][5];
		for(int i = 0; i < 5; i++) {
			for(int col = i + 1; col < 5; col++) {
				System.out.println("Informe a distância da cidade " + i + " até a cidade " + col);
				matriz[i][col] = sc.nextInt();
				matriz[col][i] = matriz[i][col];
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int col = 0; col < 5; col++) {
				System.out.println(matriz[i][col] + " ");
			}
			System.out.println();
		}
	}
}
