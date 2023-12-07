package Lista_09.model;

public abstract class Pessoa {//Aqui represento a Classe abstrata Pessoa, que não pode ser inicializada
    private String nome;
    private Data dataNascimento;//Atributo do tipo Data, que é uma Classe

    Pessoa(String nome, Data dataNascimento) {//Como a Classe Pessoa é abstrata, não pode ser inicializada, mas seus atributos precisam ser inicializados para as classes filhas poderem acessá-los.
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int hashCode(){
        return nome.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Pessoa){
            Pessoa p = (Pessoa)obj;
            return nome.equals(p.nome);
        }
        return false;
    }

    public String getNome(){
        return nome;
    }

    public String getDataNascimento(){
        return dataNascimento.toString();//Chamo o método toString da Classe Data para retornar a data de nascimento formatada
    }

    abstract public void imprimeDados();
}
