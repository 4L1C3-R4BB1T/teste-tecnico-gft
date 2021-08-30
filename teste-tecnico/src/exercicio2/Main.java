package exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		int num = sc.nextInt();
		
		boolean aux = false;
		
		System.out.printf("Divisível por");
		if (num % 3 == 0) {
			System.out.printf(" 3");
			aux = true;
		}
	
		if (num % 6 == 0) {
			System.out.printf(aux ? ", 6" : " 6");
		}
		
		if (num % 7 == 0) {
			System.out.printf(aux ? ", 7" : " 7");
		}
		
		sc.close();

	}
}
