package Agenda;

import java.util.Scanner;

public class AgendaUI {
	
	private Agenda agenda;
    Scanner entrada;
	
	public AgendaUI() {
		agenda = new Agenda();
	}
	
	public void exibirMenu()
	{
        entrada = new Scanner(System.in);
        
        for(int i=0;i!= 5;){

        System.out.println("\nMENU:\n");
		System.out.println("1 - Incluir contato");
		System.out.println("2 - Excluir contato");
		System.out.println("3 - Pesquisar contato");
		System.out.println("4 - Listar contatos");
		System.out.println("5 - Sair do sistema\n");
		int opcao = entrada.nextInt();
        
        switch (opcao){
            case 1:
                telaIncluirContato();
            break;
            case 2:
                telaExcluirContato();
            break;
            case 3:
                telaPesquisarContato();
            break;
            case 4:
                telaListarContato();
            break;
            case 5:
                System.out.println("\nSaindo do sistema...");
            	entrada.close();
			    System.exit(0);
            break;
            default:
                System.out.println("\nOpção inválida, tente novamente...");
            break;
        }
    }

	}

    private void telaListarContato() {
        if(agenda.listarContatos().isEmpty()){
            System.out.println("Não há contatos na agenda, voltando ao menu...");
        }else{
            System.out.println("\nLista de contatos:\n");
                for(Contato c : agenda.listarContatos()){
                System.out.println("Contato "+agenda.econtrarPosicao(c)+": "+c.toString());
            }
        }
    }

    private void telaPesquisarContato() {
        entrada = new Scanner(System.in);
        System.out.print("\nDigite o cpf do contato que você deseja pesquisar: ");
        String cpf = entrada.next();
        Contato c = agenda.pesquisarContato(cpf);
        if(c!=null){
            System.out.println();
            System.out.println(c);
            System.out.println("\nContato encontrado na posição: "+ (agenda.econtrarPosicao(c)) + " da agenda , voltando ao menu...");
        }else{
            System.out.println("\nContato não encontrado, voltando ao menu...");
        }
    }

    public void telaIncluirContato() {
        entrada = new Scanner(System.in);
    	System.out.print("\nDigite o cpf: ");
        String cpf = entrada.next();
    	System.out.print("Digite o nome: ");
        String nome = entrada.next();
    	System.out.print("Digite o telefone: ");
        String telefone = entrada.next();
    	System.out.print("Digite o email: ");
        String email = entrada.next();

    	Contato c = new Contato(cpf,nome,telefone,email);
    	if(agenda.incluirContato(c)){
            System.out.println("\nContato adicionado com sucesso, voltando ao menu...");
        }else{
            System.out.println("\nErro ao adicinar contato, já existe um contato com esse cpf, voltando ao menu...");
        }
    }

    public void telaExcluirContato(){
        entrada = new Scanner(System.in);
        System.out.print("\nDigite o cpf do contato que você deseja deletar: ");
        String cpf = entrada.next();
        if(agenda.excluirContato(cpf)){
            System.out.println("\nContato excluido com sucesso, voltando ao menu...");
        }else{
            System.out.println("\nErro ou excluir contato, o contato não está nessa Agenda, voltando ao menu...");
        }
    }
}