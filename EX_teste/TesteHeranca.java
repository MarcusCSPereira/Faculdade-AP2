package EX_teste;

import java.util.*;

public class TesteHeranca {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da Pessoa:");
        String n = scan.nextLine();
        System.out.println("Digite a idade da Pessoa:");
        int i = scan.nextInt();
        System.out.println("Digite a altura da pessoa:");
        double a = scan.nextDouble();

        Pessoa p = new Pessoa(n,i,a);
        System.out.println(p.getDetalhes());

        scan.close();
    }
}
