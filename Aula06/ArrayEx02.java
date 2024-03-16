import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		int numero;
		ArrayList<Integer> numeros = new ArrayList <Integer>();
		System.out.println("Escolha uma opção:\n 1 - Adicionar um número.\n 2 - Remover um número.\n 3 - Verificar a posição de um determinado número.\n 4 - MOdificar um número de uma determinada posição.\n 5 - Média dos valores.\n 6 - Imprimir números(de acordo com a posição)\n 7 - Sair.");
		menu = sc.nextInt();
		while(menu != 7) {
			switch (menu) {
			case 1: {
				System.out.println("Informe um número:");
				numero = sc.nextInt();
				numeros.add(numero);
				break;
			}
			case 2: {
				System.out.println("Informe um número para ser removido:");
				numero = sc.nextInt();
				Integer n = numero;
				numeros.remove(n);
				break;
			}
			case 3: {
				System.out.println("Informe o número para verificar a posição:");
				numero = sc.nextInt();
				System.out.println("Número na posição: " + numeros.indexOf(numero));
				break;
			}
			case 4: {
				int pos, num;
				System.out.println("Informe a posição a ser modificada:");
				pos = sc.nextInt();
				System.out.println("Informe o novo número: ");
				num = sc.nextInt();
				numeros.set(pos, num);
				break;
			}
			case 5: {
				int soma = 0;
				for(int i = 0; i < numeros.size(); i++) {
					soma += numeros.get(i);
				}
				System.out.println("Média dos valores: " + (soma/numeros.size()));
				break;

			}
			case 6: {
				System.out.println("Números na lista:");
				System.out.println(numeros.toString()); 
			}
			default:
				System.out.println("Opção inválida!");
			}
			System.out.println("Escolha uma opção:\n 1 - Adicionar um número.\n 2 - Remover um número.\n 3 - Verificar a posição de um determinado número.\n 4 - MOdificar um número de uma determinada posição.\n 5 - Média dos valores.\n 6 - Imprimir números(de acordo com a posição)\n 7 - Sair.");
			menu = sc.nextInt();
		}
		
	}
}
