import java.util.Scanner;

public class EX01 {
	public static void main(String [] args) {
		Scanner visao = new Scanner(System.in);
		int cont = 1;
		while(cont <=10) {
			System.out.println(cont);
			cont++; //cont =  cont + 1; cont += 1;
		}
		visao.close();
	}
}
