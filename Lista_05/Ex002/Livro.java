package Lista_05.Ex002;

public class Livro {
    
    private String titulo;
    private String autor;
    private int numPags;

    Livro(String titulo, String autor, int numPags){
        this.autor = autor;
        this.titulo=titulo;
        this.numPags=numPags;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumPags() {
        return numPags;
    }
    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    @Override
    public String toString(){
        return "Autor: " + autor + "\n" + "Titulo: " + titulo + "\n" + "Número de Páginas: " + numPags;
    }


}
