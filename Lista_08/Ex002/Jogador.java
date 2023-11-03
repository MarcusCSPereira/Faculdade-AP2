public class Jogador {
    private String nome;
    private int numeroCamisa;

    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " (Camisa " + numeroCamisa + ")";
    }
}