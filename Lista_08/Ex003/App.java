package Ex003;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String nomePlaylist;
        System.out.print("Digite um nome para sua playlist: ");
        nomePlaylist = scan.nextLine();

        Playlist p = new Playlist(nomePlaylist);
        p.menu(scan);
    }
}
