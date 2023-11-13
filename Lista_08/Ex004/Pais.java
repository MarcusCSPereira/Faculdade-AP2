package Ex004;

public class Pais {
    
    private String nome;
    private double dimensao;
    private double populacao;
    private static int id=0;

    Pais(String nome, double populacao, double dimensao){
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
        id++;
    }

    Pais(){}

    public int getId(){
        return id;
    }

    public double getDimensao(){
        return dimensao;
    }

    public double getPopulacao(){
        return populacao;
    }

    @Override
    public String toString(){
        return "\nPaís: " + nome + " População: " + populacao + " Dimensão: " + dimensao + " ID: " + id + "\n";
    }

}
