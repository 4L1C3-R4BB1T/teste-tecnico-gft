package exercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int starter = 0, junior = 0, senior = 0;
		
		System.out.println("Controle de Funcion�rios");
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Informe o nome da %d� pessoa: ", i+1);
			String nome = sc.nextLine();
			
			System.out.printf("Informe o cargo da %d� pessoa (Starter, Junior ou S�nior): ", i+1);
			String cargo = sc.nextLine();
			
			if (!cargo.equals("Starter") && !cargo.equals("Junior") && !cargo.equals("S�nior")) {
				cargo = "S�nior";
			}
			
			if (cargo.equals("Starter")) starter++;
			else if (cargo.equals("Junior")) junior++;
			else senior++;
			
			new Pessoa(nome, cargo); 
		}
		
		System.out.printf("\nTotal de pessoas\n");
		System.out.printf("Starter: %d\nJunior: %d\nS�nior: %d\n", starter, junior, senior);
				
		sc.close();
		
	}
}
