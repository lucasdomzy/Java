
public class Matriz {
	public static void main(String [] args) {
		int matriz [][] = new int [3][3];
		//Preenchendo a matriz
		for(int i = 0; i < 3; i++) {
			for(int col = 0; col < 3; col++) {
				matriz[i][col] = i + col;
			}
		}
		//Imprimindo matriz
		for(int i = 0; i < 3; i++) {
			for(int col = 0; col < 3; col++) {
				System.out.print(matriz[i][col] + " ");
			}
			System.out.println();
		}
	}
}
