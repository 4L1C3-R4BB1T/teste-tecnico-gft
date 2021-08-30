package exercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Multiplicando: ");
		int mult = sc.nextInt();
		
		if (mult < 0 || mult > 1500) {
			System.out.printf("O multiplicando não pode ser negativo nem maior que 1500.");
			System.exit(0);
		}
		
		System.out.printf("Início do intervalo: ");
		int ini = sc.nextInt();
		if (ini < 0 || ini > 1500) {
			System.out.printf("O início do intervalo não pode ser negativo nem maior que 1500.");
			System.exit(0);
		}
		
		System.out.printf("Fim do intervalo: ");
		int fim = sc.nextInt();
		if (fim < 0 || fim > 1500) {
			System.out.printf("O fim do intervalo não pode ser negativo nem maior que 1500.");
			System.exit(0);
		}
		
		if (fim - ini > 10) {
			System.out.printf("O intervalo não pode ter uma diferenca maior que 10.");
			System.exit(0);
		}
		
		if (ini >= fim) {
			System.out.printf("O início do intervalo deve ser menor que seu fim.");
			System.exit(0);
		} 
		
		for (int i = ini; i <= fim; i++) {
			System.out.printf("%d x %d = %d\n", mult, i, mult*i);
		}
		
		sc.close();
		
	}
}
