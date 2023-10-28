import java.util.ArrayList;
import java.util.Scanner;

public class UniversidadeUI {

    private ArrayList<Departamento> departamentos;
    private Scanner scanner;

    UniversidadeUI() {
        departamentos = new ArrayList<Departamento>();
    }

    public void menu() {
        scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nUniversidade Estadual Do Sudoeste Da Bahia");
            System.out.println("------------------------------------------");
            System.out.println("1. Adicionar departamento");
            System.out.println("2. Acessar departamento");
            System.out.println("3. Listar departamentos");
            System.out.println("4. Sair");
            System.out.println("------------------------------------------");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarDepartamento();
                    break;
                case 2:
                    acessarDepartamento();
                    break;
                case 3:
                    listarDepartamentos();
                break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
                }
            }
        }
        
        public void adicionarDepartamento() {
                System.out.println("\nAdicionar departamento");
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Sigla: ");
                String sigla = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                if(buscarDepartamento(nome)==null){
                    Departamento d = new Departamento(nome, sigla, telefone);
                    departamentos.add(d);
                    System.out.println("\nDepartamento adicionado com sucesso.");
                }else{
                    System.out.println("\nDepartamento já existe. voltando ao menu...");
                }
        }
        
        public void acessarDepartamento() {
            if(!departamentos.isEmpty()){
                System.out.print("\nNome do departamento: ");
                String nomeDepartamento = scanner.nextLine();
                Departamento d = buscarDepartamento(nomeDepartamento);
                if (d != null) {
                    menuDepartamento(d);
                } else {
                    System.out.println("Departamento não encontrado. voltando ao menu...");
                }
            }else{
                System.out.println("\nNenhum departamento cadastrado. voltando ao menu...");
            }
        }
        
        public Departamento buscarDepartamento(String nome) {
            for (Departamento d : departamentos) {
                if (d.getNome().equals(nome)) {
                    return d;
                }
            }
            return null;
        }

    public void listarDepartamentos() {
        if(!departamentos.isEmpty()){
            System.out.println("\nDepartamentos:");
            for (Departamento d : departamentos) {
                System.out.println(d);
            }
        }else{
            System.out.println("\nNenhum departamento cadastrado. voltando ao menu...");
        }
    }

    public void menuDepartamento(Departamento d) {

        ArrayList<Professor> professores = d.informarProfessores();

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nDepartamento: " + d.getNome());
            System.out.println("------------------------------------------");
            System.out.println("1. Adicionar professor");
            System.out.println("2. Demitir professor");
            System.out.println("3. Listar professores");
            System.out.println("4. Sair");
            System.out.println("------------------------------------------");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("CPF: ");
                    Long cpf = scanner.nextLong();
                    System.out.print("Email: ");
                    String email = scanner.next();
                    System.out.print("Data de nascimento: ");
                    String dataNascimento = scanner.next();
                    Professor p = new Professor(nome, cpf, email, dataNascimento);
                    if (d.buscarProfessores(cpf)==null){ 
                        d.adicionarProfessores(p);
                        System.out.println("\nProfessor adicionado com sucesso.");
                    } else {
                        System.out.println("\nProfessor já existe.");
                    }
                    break;
                case 2:
                    // Demitir professor
                    if(professores.isEmpty()){
                        System.out.println("\nNenhum professor cadastrado. Voltando ao menu...");
                        break;
                    }
                    System.out.print("\nCPF do professor a ser demitido: ");
                    Long cpfDemitir = scanner.nextLong();
                    if (d.demitirProfessores(cpfDemitir)) {
                        System.out.println("\nProfessor demitido com sucesso.");
                    } else{
                        System.out.println("\nProfessor não encontrado. Voltando ao menu...");
                    }
                    break;
                case 3:
                    // Listar professores
                    if(professores.isEmpty()){
                        System.out.println("\nNenhum professor cadastrado. Voltando ao menu...");
                        break;
                    }else{
                        System.out.println("\nProfessores:");
                        for (Professor professor : professores) {
                            System.out.println(professor);
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nVoltando ao menu de Departamentos...");
                    menu();
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    menuDepartamento(d);
                    break;
                }
            
        }
    }
}
