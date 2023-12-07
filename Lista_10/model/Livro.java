package Lista_10.model;

public class Livro extends Produto{
    private String autor;
    private int paginas;

    public Livro(String nome, String autor,int paginas, double preco) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String ehGrande() {
        if(this.paginas>200)
            return "É grande";
        return "Não é grande";
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAutor: " + autor +
                "\nNúmero de páginas: " + paginas +
                "\n"+ehGrande();
    }

}
