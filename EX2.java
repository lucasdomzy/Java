import java.util.Scanner;

public class EX2 {
	public static void main(String [] args) {
		Scanner in  = new Scanner(System.in);
		double x1, y1, x2, y2, aux_x, aux_y, raiz, distancia;
		System.out.println("informe as coordenadas do ponto P1: ");
		x1=in.nextDouble();
		y1=in.nextDouble();
		System.out.println("Informe as coordenadas do ponto P2");
		x2=in.nextDouble();
		y2=in.nextDouble();
		aux_x = Math.pow(x2 - x1, 2);
		aux_y = Math.pow(y2 - y1, 2);
		distancia = Math.sqrt(aux_x + aux_y);
		System.out.println("A distância entre os ponto é: " + distancia);
		
	}
}
