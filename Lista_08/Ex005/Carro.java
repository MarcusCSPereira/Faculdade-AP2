package Ex005;

import java.util.Scanner;

public class Carro {
    private String nome;
    private double preco_Totalpneus;
    private double preco_Totalbancos;
    private double preco_motor;
    private boolean montado=false;
    private Pneu[] pneus;
    private Banco[] bancos;
    private Motor motor;

    Carro(String nome){
        this.nome = nome;
        pneus = new Pneu[4];
        bancos = new Banco[5];
    }

    public void montarCarro(Scanner scan){
        if (montado) {
            System.out.println("Esse carro já está montado!");
        }

        int tipoPneu;
            System.out.println("Escolha o tipo do seu pneu: ");
            System.out.println("--------------------------");
            System.out.println("1 - Pirelli | Preço da unidade: 100R$");
            System.out.println("2 - Michelin | Preço da unidade: 200R$");
            System.out.println("3 - Goodyear | Preço da unidade: 300R$");
            System.out.println("4 - Firestone | Preço da unidade: 400R$");
            System.out.println("--------------------------");
            tipoPneu = scan.nextInt();
        for (int i = 0; i < 4; i++) {
            pneus[i] = new Pneu(tipoPneu);
            preco_Totalpneus += pneus[i].getPreço();
        }

        int fabricanteMotor;
            System.out.println("Escolha o fabricante do seu motor: ");
            System.out.println("--------------------------");
            System.out.println("1 - Fiat | Preço: 10.000R$ | Potência: 100");
            System.out.println("2 - Ford | Preço: 20.000R$ | Potência: 200");
            System.out.println("3 - Chevrolet | Preço: 30.000R$ | Potência: 300");
            System.out.println("4 - Volkswagen | Preço: 40.000R$ | Potência: 400");
            System.out.println("--------------------------");
            fabricanteMotor = scan.nextInt();
            switch (fabricanteMotor) {
                case 1:
                    motor = new Motor("Fiat");
                    break;
                case 2:
                    motor = new Motor("Ford");
                    break;
                case 3:
                    motor = new Motor("Chevrolet");
                    break;
                case 4:
                    motor = new Motor("Volkswagen");
                    break;
                default:
                    System.out.println("Fabricante inválido!");
                    break;
            }
            preco_motor = motor.getPreço();

        int escolhaBanco;
        String fabricanteBanco = "";
        do{
            System.out.println("Escolha o fabricante do seu banco: ");
            System.out.println("--------------------------");
            System.out.println("1 - Fiat | Preço: 1.000R$ | Modelo: Confort");
            System.out.println("2 - Ford | Preço: 2.000R$ | Modelo: Sport");
            System.out.println("3 - Chevrolet | Preço: 3.000R$ | Modelo: Couro");
            System.out.println("4 - Volkswagen | Preço: 4.000R$ | Modelo: Luxo");
            System.out.println("--------------------------");
            escolhaBanco = scan.nextInt();
            switch (escolhaBanco) {
                case 1:
                    fabricanteBanco = "Fiat";
                    break;
                case 2:
                    fabricanteBanco = "Ford";
                    break;
                case 3:
                    fabricanteBanco = "Chevrolet";
                    break;
                case 4:
                    fabricanteBanco = "Volkswagen";
                    break;
                default:
                    System.out.println("Fabricante inválido!");
                    break;
            }
        }while(escolhaBanco<1 || escolhaBanco>4);

        for (int i = 0; i < 5; i++) {
            bancos[i] = new Banco(fabricanteBanco);
            preco_Totalbancos += bancos[i].getPreço();
        }

        System.out.println("Carro montado com sucesso!");
        montado=true;
    }

    public void preco_total(){
        if(montado){
            double pt = preco_Totalbancos+preco_Totalpneus+preco_motor;
            System.out.println("\nPreço total desse carro: "+ pt+" R$");
        }
    }

    public void infoCarro(){
        if(montado){
            System.out.println("\nNome do carro: "+nome);
            System.out.println(motor.toString());
            System.out.println(pneus[1].toString());
            System.out.println(bancos[1].toString());
        }else{
            System.out.println("O carro ainda não foi montado!");
        }
    }
}
