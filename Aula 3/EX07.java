import java.util.Scanner;

public class EX07 {
	public static void main(String [] args) {
		Scanner visao = new Scanner(System.in);
		int dia;
		System.out.println("Informe o dia da semana:");
		dia = visao.nextInt();
		switch(dia) {
		case 1:{
			System.out.println("Domingo");
			break;
		}
		case 2:{
			System.out.println("Segunda");
		}
		case 3:{
			System.out.println("Terça");
			break;
		}
		case 4:{
			System.out.println("Quarta");
			break;
		}
		case 5:{
			System.out.println("Quinta");
			break;
		}
		case 6:{
			System.out.println("Sexta");
			break;
		}
		case 7:{
			System.out.println("Sábado");
			break;
		}
		default:{
			System.out.println("Os dias vão de 1 a 7 gênio!");
			break;
		}
		}
		visao.close();
	}
}
