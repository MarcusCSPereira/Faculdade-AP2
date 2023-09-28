package Lista_05.Ex004;


public class Produto {
    
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;


    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preco;
    }

    public double getValorTotalEmEstoque(){
        return this.preco*this.quantidadeEmEstoque;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    
    public void adicionarAoEstoque(int n){
        this.quantidadeEmEstoque+=n;
    }

    public void retirarDoEstoque(int n){
        if(this.quantidadeEmEstoque == 0){
            this.quantidadeEmEstoque=0;
        }else{
            this.quantidadeEmEstoque-=n;
        }
    }

}
