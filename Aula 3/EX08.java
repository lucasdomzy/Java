import java.util.Scanner;

public class EX08 {
	public static void main(String [] args) {
		Scanner visao = new Scanner(System.in);
		int n;
		double temp, conv;
		System.out.println("Informe a temperatura:");
		temp = visao.nextDouble();
		System.out.println("Informe a conversão que deseja:\n 1 - Kelvin(K)\n 2 - Réaumur(Re)\n 3 - Rankine(Ra)\n 4 - Fahrenheit(F)\n");
		n = visao.nextInt();
		switch(n) {
		case 1:{
			conv = temp + 273.15;
			System.out.println("Temperatura em Kelvin: " + conv);
			break;
		}
		case 2:{
			conv = temp * 0.8;
			System.out.println("Temperatura em Réaumur: " + conv);
			break;
		}
		case 3:{
			conv = temp * 1.8 + 459.67;
			System.out.println("Temperatura em Rankine: " + conv);
			break;
		}
		case 4:{
			conv = temp * 1.8 + 32;
			System.out.println("Temperatura em Fahrenheit: " + conv);
			break;
		}
		default:{
			System.out.println("Essa opção não existe irmão");
			break;
		}
		}
		}
}
