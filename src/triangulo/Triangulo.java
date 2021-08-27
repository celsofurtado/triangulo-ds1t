package triangulo;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual a medida do lado A?");
		a = leitor.nextInt();
		
		System.out.print("Qual a medida do lado B?");
		b = leitor.nextInt();
		
		System.out.print("Qual a medida do lado C?");
		c = leitor.nextInt();
		
		leitor.close();
		
		// Verificar se � um tri�ngulo
		if (b + a > c && c + b > a && c + a > b) {
			
			if (a == b && b == c && c == a) {
				System.out.println("EQUIL�TERO");
			} else if(a != b && b != c && c != a) {
				System.out.println("ESCALENO");
			} else {
				System.out.println("IS�SCELES");
			}
			
			
		} else {
			System.out.println("Sinto muito, n�o � um tri�ngulo!");
		}

	}

}
