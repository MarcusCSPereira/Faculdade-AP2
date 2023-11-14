package Ex005;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomedoCarro;
        System.out.println("Digite o nome do seu carro: ");
        nomedoCarro = scan.nextLine();
        Carro carro = new Carro(nomedoCarro);
        carro.montarCarro(scan);
        carro.infoCarro();
        carro.preco_total();
        scan.close();
    }
}
