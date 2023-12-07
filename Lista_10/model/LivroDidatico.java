package Lista_10.model;

public class LivroDidatico extends Livro{
    private String disciplina;

    public LivroDidatico(String nome, String autor, int paginas, double preco, String disciplina) {
        super(nome, autor, paginas, preco);
        this.disciplina = disciplina;
    }

    @Override
    public boolean ehCaro(){
        if(getPreco()>200){return true;}
        else{return false;}
    }

    @Override
    public String toString(){
        return super.toString()+
                "\nDisciplina: "+disciplina;
    }
}

