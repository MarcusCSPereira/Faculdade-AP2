import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removerJogador(String nome) {
        Jogador j=pesquisarJogador(nome);
        if(j!=null){
            jogadores.remove(j);
            System.out.println("Jogador removido com sucesso\n");
        }else{
            System.out.println("Jogador não encontrado\n");
        }
    }

    public void listarJogadores() {
        System.out.println("Jogadores no " + nome + ":");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

    public Jogador pesquisarJogador(String nome) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equals(nome)) {
                return jogador;
            }
        }
        return null;
    }
}