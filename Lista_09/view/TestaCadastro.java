package Lista_09.view;
import java.util.*;

import Lista_09.controller.CadastroPessoa;
import Lista_09.model.*;

public class TestaCadastro {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de cadastro de pessoas");
        System.out.println("Digite o número de pessoas máximas que deseja cadastrar:");
        int qtdMax = scan.nextInt();
        System.out.println("===============================================");
        CadastroPessoa cadastro = new CadastroPessoa(qtdMax);

        menu(scan,cadastro);
    }
    
    public static void menu(Scanner scan, CadastroPessoa cadastro){
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Cadastrar pessoa");
        System.out.println("2 - Imprimir cadastro");
        System.out.println("3 - Quantidade de pessoas cadastradas");
        System.out.println("4 - Sair");
        int opc = scan.nextInt();
        switch(opc){
            case 1: 
                telaCadastro(scan,cadastro);
                break;
            case 2:
                telaImprimeCadastro(scan,cadastro);
                break;
            case 3:
                telaRetornaQuantidade(scan,cadastro);
            case 4:
                scan.close();
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");   
        }
    }
    
    private static void telaCadastro(Scanner scan, CadastroPessoa cadastro) {
        
        if(cadastro.getQtdAtual() == cadastro.getQtdMaxima()){
            System.out.println("\nCadastro cheio, número de pessoas cadastradas: "+cadastro.getQtdAtual()+"\n");
            System.out.println("Listando Cadastro:");
            cadastro.imprimeCadastro();
            return;
        }
    
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Cadastrar funcionário");
        System.out.println("2 - Cadastrar gerente");
        System.out.println("3 - Cadastrar cliente");
        System.out.println("4 - Voltar ao menu anterior");
        int opc = scan.nextInt();
        scan.nextLine();
        switch(opc){
            case 1: 
                System.out.println("\nDigite o nome do funcionário:");
                String nome = scan.nextLine();
                System.out.println("Digite a data de nascimento do funcionário: DD/MM/AAAA");
                String dataNascimento = scan.next();
                System.out.println("Digite o salário do funcionário:");
                float salario = scan.nextFloat();
                cadastro.cadastraPessoa(new Funcionario(nome, new Data(dataNascimento), salario));
                menu(scan, cadastro);
                break;
            case 2:
                System.out.println("\nDigite o nome do gerente:");
                String nomeGerente = scan.nextLine();
                System.out.println("Digite a data de nascimento do gerente: DD/MM/AAAA");
                String dataNascimentoGerente = scan.next();
                System.out.println("Digite o salário do gerente:");
                float salarioGerente = scan.nextFloat();
                scan.nextLine();
                System.out.println("Digite a área do gerente:");
                String area = scan.nextLine();
                cadastro.cadastraPessoa(new Gerente(nomeGerente, new Data(dataNascimentoGerente), salarioGerente,area));
                menu(scan, cadastro);
                break;
            case 3:
                System.out.println("\nDigite o nome do cliente:");
                String nomeCliente = scan.nextLine();
                System.out.println("Digite a data de nascimento do cliente: DD/MM/AAAA");
                String dataNascimentoCliente = scan.next();
                System.out.println("Digite o código do cliente:");
                int codigo = scan.nextInt();
                scan.nextLine();
                cadastro.cadastraPessoa(new Cliente(nomeCliente, new Data(dataNascimentoCliente), codigo));
                menu(scan, cadastro);
                break;
            case 4:
                menu(scan, cadastro);
                break;
            default:
                System.out.println("Opção inválida");   
        }
    }
    
    private static void telaImprimeCadastro(Scanner scan,CadastroPessoa cadastro) {
        cadastro.imprimeCadastro();
        menu(scan, cadastro);
    }

    private static void telaRetornaQuantidade(Scanner scan, CadastroPessoa cadastro) {
        System.out.println("\nQuantidade de pessoas cadastradas: " + cadastro.getQtdAtual());
        menu(scan, cadastro);
    }

}
