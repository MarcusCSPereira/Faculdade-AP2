package Ex003;

import java.util.*;

public class Playlist {

    ArrayList<Musica> musica;
    private String nomePlaylist;

    Playlist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
        musica = new ArrayList<>();
    }

    public Musica pesqMusica(int id) {
        for (Musica m : musica) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    public void listMusica() {
        System.out.println();
        for (Musica m : musica) {
            System.out.println(m);
        }
    }

    public void addMusica(Musica m) {
        if (pesqMusica(m.getId()) == null) {
            musica.add(m);
            System.out.println("Música adicionada com sucesso\n");
        } else {
            System.out.println("Erro ao adiconar música");
        }
    }

    public void removeMusica(Musica m) {
        if (pesqMusica(m.getId()) != null) {
            musica.remove(m);
            System.out.println("Música removida com sucesso\n");
        } else {
            System.out.println("Erro ao adicionar música");
        }
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
        }
    }

    public void menu(Scanner scan) {
        int opc;
        do {
            System.out.println("---------------------------------");
            System.out.println("1- Adicionar música a playlist");
            System.out.println("2- Remover música da playlist");
            System.out.println("3- Listar músicas da playlist");
            System.out.println("4- Sair da Aplicação");
            System.out.println("---------------------------------");
            System.out.print("Digite a opção que deseja fazer: ");
            opc = scan.nextInt();
            scan.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("\nDigite o nome da sua música: ");
                    String telaNomeMusica;
                    telaNomeMusica = scan.nextLine();
                    System.out.print("Digite o nome do artista da sua música: ");
                    String telaNomeArtista;
                    telaNomeArtista = scan.nextLine();
                    Musica m = new Musica(telaNomeMusica, telaNomeArtista);
                    addMusica(m);
                    break;
                case 2:
                    if (musica.isEmpty()) {
                        System.out.println("A sua playlist não contém músicas");
                    }else{
                        listMusica();
                        System.out.print("\nDigite o id da música que você deseja remover: ");
                        int telaId;
                        telaId = scan.nextInt();
                        scan.nextLine();
                        removeMusica(pesqMusica(telaId));
                    }
                    break;
                case 3:
                    if (musica.isEmpty()) {
                        System.out.println("A sua playlist ainda está vazia");
                    } else {
                        System.out.println("\nMúsicas da Playlist " + nomePlaylist + ":");
                        listMusica();
                    }
                    break;
                case 4:
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    clearConsole();
                    System.out.println("Você digitou uma opção inválida, tente novamente!\n");
                break;
            }
        } while (opc != 4);
    }

}
