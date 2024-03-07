import java.util.Scanner;

public class EX05 {
	public static void main(String [] args) {
		Scanner visao = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		System.out.println("Informe a nota 1: ");
		n1 = visao.nextDouble();
		System.out.println("Informe a nota 2: ");
		n2 = visao.nextDouble();
		System.out.println("Informe a nota 3: ");
		n3 = visao.nextDouble();
		System.out.println("Informe a nota 4: ");
		n4 = visao.nextDouble();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		if(media >= 6.0) {
			System.out.println("Media:" + media + "\nAprovado!");
		}
		else {
			System.out.println("Media:" + media + "\nReprovado!");
		}
		visao.close();
		
		
	}
}
