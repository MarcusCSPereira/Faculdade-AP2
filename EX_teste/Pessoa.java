package EX_teste;


public class Pessoa{
    
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome,int idade, double altura){
        this.nome=nome;
        this.idade=idade;
        this.altura=altura;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double alt){
        this.altura=alt;
    }

    public void setIdade(int idade){
        if(idade<1){
            System.out.println("idade invélida");
        }else{
            this.idade=idade;
        }
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getDetalhes(){
        return "Nome: " + this.nome + " Idade: " + this.idade + " Altura: " + this.altura;
    }

}