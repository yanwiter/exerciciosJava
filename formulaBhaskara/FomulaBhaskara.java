import java.util.Scanner;
public class FomulaBhaskara {

	public static void main(String[] args) {
		
		
		// Exercicio feito 12/05/21
		
		Scanner input = new Scanner(System.in);
		
		double a, b, c, delta,x1, x2;
		 
		
		System.out.println("Informe o valor de A:");
		a = input.nextDouble();
		
		System.out.println("Informe o valor de B:");
		b = input.nextDouble();
		
		System.out.println("Informe o valor de C:");
		c = input.nextDouble();
		
		delta = b * b - 4 * a * c;
		
		if (delta >= 0) {
			x1 = (- b + Math.sqrt(delta)) / (2 * a);
			x2 = (- b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("X1 = " + x1);
			System.out.println("X2 = " + x2);
		
		}else {
			System.out.println("Não foi possível simular!");
		}
	}

}
