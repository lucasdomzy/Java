import java.util.Scanner;

public class EX1 {

		public static void main(String [] args) {
			Scanner in = new Scanner(System.in);
			double p1, desc, pf;
			System.out.println("Informe o valor do produto: ");
			p1 = in.nextDouble();
			desc = p1*0.09;
			pf = p1 - desc;
			System.out.println("O valor com descontos: " + pf);
		}
}
