import java.util.Scanner;

public class EX03 {
	public static void main(String [] args) {
		Scanner visao = new Scanner(System.in);
		int n;
		System.out.println("Informe um número: ");
		n = visao.nextInt();
		if(n > 0) {
			System.out.println("O número é positivo!");
		}
		else if(n == 0) {
			System.out.println("O número é nulo!");
		}
		else {
			System.out.println("O número é negativo!");
		}
		visao.close();
	}
}
