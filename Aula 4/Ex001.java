import java.util.Scanner;

public class Ex001 {
	public static void main (String [] args) {
		Scanner visao = new Scanner (System.in);
		int n, cont = 0, soma = 0;
		System.out.println("Informe um valor");
		n = visao.nextInt();
		while(cont <= n) {
			cont++;
			if(cont % 2 == 0) {
				soma+=cont;
			}
		}
		 /*int limite, s = 0;
		 System.out.println("Informe o limite");
		 limite = visao.nextInt();
		 for(int aux = 0; cont <= limite ; aux += 2) {
			 s += aux;
		 }*/
		System.out.println(soma);
		visao.close();
	}
}
