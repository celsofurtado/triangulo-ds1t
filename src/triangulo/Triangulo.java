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
		
		// Verificar se é um triângulo
		if (b + a > c && c + b > a && c + a > b) {
			
			if (a == b && b == c && c == a) {
				System.out.println("EQUILÁTERO");
			} else if(a != b && b != c && c != a) {
				System.out.println("ESCALENO");
			} else {
				System.out.println("ISÓSCELES");
			}
			
			
		} else {
			System.out.println("Sinto muito, não é um triângulo!");
		}
		
		System.out.println("fim");

	}

}
