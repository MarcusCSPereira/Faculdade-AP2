public class TimeUI {
    public static void main(String[] args) {
        // Criar jogadores
        Jogador jogador1 = new Jogador("Neymar", 10);
        Jogador jogador2 = new Jogador("Messi", 30);
        Jogador jogador3 = new Jogador("Mbappé", 7);

        // Criar um time
        Time time1 = new Time("Paris Saint-Germain");
        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);
        time1.adicionarJogador(jogador3);

        // Listar jogadores no time
        time1.listarJogadores();

        // Remover um jogador do time
        time1.removerJogador("Neymar");
        time1.removerJogador("CR7");

        time1.listarJogadores();
    }
}
