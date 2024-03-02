import java.util.Scanner;

public class EX3 {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		double n1,n2, n3, media;
		System.out.println("Informe as três notas do aluno:");
		n1 = in.nextDouble();
		n2 = in.nextDouble();
		n3 = in.nextDouble();
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5))/10;
		System.out.println("A média ponderada é: " + media);
	}
	
}
