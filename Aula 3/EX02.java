import java.util.Scanner;

public class EX02 {
	public static void main(String [] args){
		Scanner ver = new Scanner (System.in);
		String palavra;
		System.out.println("Informe uma palavra: ");
		palavra = ver.next();
		System.out.println("10 primeiros caracteres: " + palavra.substring(0, 10));
		ver.close();
	}
}
