package exercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int starter = 0, junior = 0, senior = 0;
		
		System.out.println("Controle de Funcionários");
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Informe o nome da %dª pessoa: ", i+1);
			String nome = sc.nextLine();
			
			System.out.printf("Informe o cargo da %dª pessoa (Starter, Junior ou Sênior): ", i+1);
			String cargo = sc.nextLine();
			
			if (!cargo.equals("Starter") && !cargo.equals("Junior") && !cargo.equals("Sênior")) {
				cargo = "Sênior";
			}
			
			if (cargo.equals("Starter")) starter++;
			else if (cargo.equals("Junior")) junior++;
			else senior++;
			
			new Pessoa(nome, cargo); 
		}
		
		System.out.printf("\nTotal de pessoas\n");
		System.out.printf("Starter: %d\nJunior: %d\nSênior: %d\n", starter, junior, senior);
				
		sc.close();
		
	}
}
