package exercicio1;

public class Gato extends Animal {
	
	public Gato(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public void som() {
        System.out.println("miau");
    }

    @Override
    public double quantidadeDeRacao() {
        double qtdRacao = 0, peso = this.getPeso();
       
        if (peso <= 3) qtdRacao = peso*10;
        else qtdRacao = peso*13;
        
        return qtdRacao;
    }

}
