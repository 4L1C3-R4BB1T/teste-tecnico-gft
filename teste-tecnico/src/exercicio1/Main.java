package exercicio1;

public class Main {
	public static void main(String[] args) {

		Gato g1 = new Gato("Daphne", 20);
		Gato g2 = new Gato("Artemis", 3);
		Cachorro c1 = new Cachorro("Xereta", 10);
		Gato g3 = new Gato("Victor Hugo", 5);
		
		double totalRacao = g1.quantidadeDeRacao() + g2.quantidadeDeRacao() 
			+ c1.quantidadeDeRacao() + g3.quantidadeDeRacao();
		
		System.out.printf("TOTAL DE RACAO: %.3fKg (%.3fg)\n", totalRacao/1000, totalRacao);
		
	}
}
