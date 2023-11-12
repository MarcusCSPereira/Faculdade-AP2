package Ex003;

public class Musica {
    private String nome;
    private String artista;
    private static int id=0;

    Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
        id++;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista(){
        return artista;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return "\nMúsica: " + nome + " Artista: " + artista + " ID: " + id + "\n";
    }

}
