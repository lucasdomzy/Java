import java.util.Scanner;

public class EX04 {
	public static void main(String [] args) {
		Scanner visao = new Scanner(System.in);
		int n;
		System.out.println("Informe um número: ");
		n = visao.nextInt();
		if (n % 2 == 0 && n % 5 == 0) {
			System.out.println("O número é divisível " + "por 2 e por 5 ao mesmo tempo!");
		}
		else {
			System.out.println("O número não é divisível por 2 e por 5!");
		}
	}
}
