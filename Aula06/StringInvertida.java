import java.util.Scanner;

public class StringInvertida {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		String text;
		System.out.println("Digite uma palavra ou frase para vê-la invertida:");
		text = sc.nextLine();
		/*
		String invertida = new StringBuilder(text).reverse().toString();
		System.out.println("String original: " + text);
		System.out.println("String invertida: " + invertida);
		sc.close();
		*/
		 for(int i = text.length()-1; i >= 0; i--){
		 	
		 	System.out.print(text.charAt(i) + " ");
		 
		 }
		 
	}
}
