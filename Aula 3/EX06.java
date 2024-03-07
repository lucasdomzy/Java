import java.util.Scanner;

public class EX06 {
	public static void main(String [] args) {
		Scanner visao = new Scanner(System.in);
		double salarioI, salarioR, salarioRA, reajuste;
		
		System.out.println("Informe o salário inicial: ");
		salarioI =  visao.nextDouble();
		reajuste = salarioI * 0.05;
		salarioR = salarioI - reajuste;
		
		//terminar em casa
	}
}
