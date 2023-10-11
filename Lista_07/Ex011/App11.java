package Lista_07.Ex011;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int controle = 0;

        try {
            System.out.print("Digite o número de Restaurantes que você deseja cadastrar: ");
            controle = scan.nextInt();
            System.out.println();
        } catch (InputMismatchException ex) {
            System.out.println("ERRO | Digite um número inteiro para validar a entrada ");
        }

        scan.nextLine();

        Restaurante[] restaurantes = new Restaurante[controle];

            for (int i = 0; i < controle; i++) {
                try {
                    restaurantes[i] = new Restaurante();
                    System.out.print("Digite o nome do Restaurante " + (i + 1) + " que você deseja cadastrar: ");
                    restaurantes[i].setNome(scan.nextLine());
                    System.out.print("Digite o tipo de comida do Restaurante " + (i + 1) + " que você deseja cadastrar: ");
                    restaurantes[i].setFoodType(scan.nextLine());
                    System.out.print("Digite o endereço do Restaurante " + (i + 1) + " que você deseja cadastrar: ");
                    restaurantes[i].setEndereco(scan.nextLine());
                    System.out.print("Digite o preço médio do Restaurante " + (i + 1) + " que você deseja cadastrar: ");
                    restaurantes[i].setPreçoMed(scan.nextDouble());
                    System.out.println();
                } catch (InputMismatchException ex) {
                    System.out.println("ERRO | Você digitou o valor do preço médio errado");
                }
                scan.nextLine();
            }

        //cadastrarRestaurantes(restaurantes, controle);

        String opc;
        System.out.print("Digite um tipo de comida {salgada},{doce},{agridoce}: ");
        opc = scan.nextLine();
        System.out.println();

        for (Restaurante restaurante : restaurantes) {
            if (restaurante.getFoodType().equalsIgnoreCase(opc)) {
                System.out.println(restaurante.toString());
            }
        }

        scan.close();
    }
}
