package exercicio1;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, double peso) {
		super(nome, peso);
	}

    @Override
    public void som() {
        System.out.println("auau");
    }

    @Override
    public double quantidadeDeRacao() {
        double qtdRacao = 0, peso = this.getPeso();
       
        if (peso <= 4) qtdRacao = peso*40;
        else if (peso <= 12) qtdRacao = peso*45;
        else qtdRacao = peso*55;
        
        return qtdRacao;
    }

}
