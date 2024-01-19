package EX_teste;

public class Aluno {
    private String nome;
    private int idade;
    static private int controle=0;
    private int numDeMatricula;

    public Aluno(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
        controle++;
        this.numDeMatricula=controle;
    }

    public int getNumDeMatricula() {
        return numDeMatricula;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
