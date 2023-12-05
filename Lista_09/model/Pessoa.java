package Lista_09.model;

public abstract class Pessoa {
    private String nome;
    private Data dataNascimento;

    Pessoa(String nome, Data dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){
        return nome;
    }

    public String getDataNascimento(){
        return dataNascimento.toString();
    }

    abstract public void imprimeDados();
}
