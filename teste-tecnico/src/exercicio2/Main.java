package exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero: ");
		int num = sc.nextInt();
		
		boolean aux = false;
		
		System.out.printf("Divis�vel por");
		if (num % 3 == 0) {
			System.out.printf(" 3");
			aux = true;
		}
	
		if (num % 6 == 0) {
			if (aux) System.out.printf(",");
			System.out.printf(" 6");
		}
		
		if (num % 7 == 0) {
			if (aux) System.out.printf(",");
			System.out.printf(" 7");
		}
		
		sc.close();

	}
}
