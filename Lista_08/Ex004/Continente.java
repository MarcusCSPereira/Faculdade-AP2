package Ex004;

import java.util.ArrayList;
import java.util.Scanner;

public class Continente {
    ArrayList<Pais> paises;
    private String nomecontinente;
    

    Continente(String nomecontinente){
        this.nomecontinente = nomecontinente;
        paises = new ArrayList<>();
    }

    public void menuContinente(Scanner scan){
        int opc;
        System.out.println("\nNome do continente: " + nomecontinente);
        System.out.println("1 - Adicionar país");
        System.out.println("2 - Listar países");
        System.out.println("3 - Dimensão total do continente");
        System.out.println("4 - População total do continente");
        System.out.println("5 - Densidade populacional do continente");
        System.out.println("6- País com maior e menor população");
        System.out.println("7 - Sair");
        opc = scan.nextInt();
        scan.nextLine();

        do{
            switch (opc) {
                case 1:
                    System.out.println("\nDigite o nome do país que deseja adicionar: ");
                    String telaNome = scan.nextLine();
                    System.out.println("\nDigite a população do país (em milhões de pessoas) que esse país possui: ");
                    double telaPopulacao = scan.nextDouble();
                    System.out.println("\nDigite a dimensão do país (em milhões de km²) que esse país possui: ");
                    double telaDimensao = scan.nextDouble();
                    Pais p = new Pais(telaNome, telaPopulacao, telaDimensao);
                    addPais(p);
                break;
                case 2:
                    listPais();
                break;
                case 3:
                    dimTotPais();
                break;
                case 4:
                    popTotPais();
                break;
                case 5:
                    densidadePop();
                break;
                case 6:
                    
                break;
                case 7:
                    
                break;
                default:
                break;
            }
        }while(opc != 8);
    }

    public Pais pesquisaPais(int id){
        for(Pais p : paises){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public void addPais(Pais p){
        if(pesquisaPais(p.getId()) == null){
            paises.add(p);
            System.out.println("País adicionado com sucesso\n");
        }
        else{
            System.out.println("Erro ao adicionar país\n");
        }
    }
    
    public void listPais(){
        System.out.println();
        for (Pais p : paises) {
            System.out.println(p);
        }
    }

    public void dimTotPais(){
        double dimensaoTotal = 0;
        for(Pais p : paises){
            dimensaoTotal += p.getDimensao();
        }
        System.out.println("\nA dimensão total do continente é de: " + dimensaoTotal + " milhões de km²");
    }

    public void popTotPais(){
        double popTotal = 0;

        for(Pais p : paises){
            popTotal += p.getPopulacao();
        }
        System.out.println("\nA população total do continente é de: " + popTotal + " milhões de pessoas");
    }

    public void densidadePop(){
        double dimensaoContinente = 0;
        double populacaoContinente = 0;
        for(Pais p: paises){
            dimensaoContinente += p.getDimensao();
            populacaoContinente += p.getPopulacao();
        }
        System.out.println("A densidade populacional desse continente é: " + populacaoContinente/dimensaoContinente);
    }

    public void menorMaiorpais(){
        double menor = Integer.MAX_VALUE;
        double maior = Integer.MIN_VALUE;
        Pais pMaior = new Pais();
        Pais pMenor = new Pais();
        for (Pais p : paises) {
            if(p.getPopulacao()<menor){
                pMenor = p;
            }
            if (p.getPopulacao()>maior) {
                pMaior = p;
            }
        }
        System.out.println("O país com maior população é o: " + pMaior.toString() + " e o país com menor população é o: " + pMenor.toString());
    }

}
