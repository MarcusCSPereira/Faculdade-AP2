package Ex004;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeContinente;
        System.out.println("Digite o nome do continente: ");
        nomeContinente = scan.nextLine();
        Continente continente = new Continente(nomeContinente);
        continente.menuContinente(scan);
    }
    
}
