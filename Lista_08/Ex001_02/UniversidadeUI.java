import java.util.ArrayList;
import java.util.Scanner;

public class UniversidadeUI {
    private ArrayList<Departamento> departamentos;
    private Scanner scanner;

    UniversidadeUI() {
        departamentos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        int opcao;
        do {
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
                    System.out.println("\nEncerrando o programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public void adicionarDepartamento() {
        System.out.println("\nAdicionar departamento");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        if (buscarDepartamento(nome) == null) {
            System.out.print("Sigla: ");
            String sigla = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            Departamento departamento = new Departamento(nome, sigla, telefone);
            departamentos.add(departamento);
            System.out.println("\nDepartamento adicionado com sucesso.");
        } else {
            System.out.println("\nDepartamento já existe. Voltando ao menu...");
        }
    }

    public void acessarDepartamento() {
        if (departamentos.isEmpty()) {
            System.out.println("\nNenhum departamento cadastrado. Voltando ao menu...");
        } else {
            System.out.print("\nNome do departamento: ");
            String nomeDepartamento = scanner.nextLine();
            Departamento departamento = buscarDepartamento(nomeDepartamento);

            if (departamento != null) {
                menuDepartamento(departamento);
            } else {
                System.out.println("Departamento não encontrado. Voltando ao menu...");
            }
        }
    }

    public Departamento buscarDepartamento(String nome) {
        for (Departamento departamento : departamentos) {
            if (departamento.getNome().equals(nome)) {
                return departamento;
            }
        }
        return null;
    }

    public void listarDepartamentos() {
        if (departamentos.isEmpty()) {
            System.out.println("\nNenhum departamento cadastrado. Voltando ao menu...");
        } else {
            System.out.println("\nDepartamentos:");
            for (Departamento departamento : departamentos) {
                System.out.println(departamento);
            }
        }
    }

    public void menuDepartamento(Departamento departamento) {
        int opcao;
        do {
            ArrayList<Professor> professores = departamento.informarProfessores();
            System.out.println("\nDepartamento: " + departamento.getNome());
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
                    adicionarProfessor(departamento);
                    break;
                case 2:
                    demitirProfessor(departamento);
                    break;
                case 3:
                    listarProfessores(departamento);
                    break;
                case 4:
                    System.out.println("\nVoltando ao menu de Departamentos...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }

    public void adicionarProfessor(Departamento departamento) {
        System.out.println("\nAdicionar professor");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        Long cpf = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        Professor professor = new Professor(nome, cpf, email, dataNascimento);

        if (departamento.adicionarProfessores(professor)) {
            System.out.println("\nProfessor adicionado com sucesso.");
        } else {
            System.out.println("\nProfessor já existe.");
        }
    }

    public void demitirProfessor(Departamento departamento) {
        ArrayList<Professor> professores = departamento.informarProfessores();

        if (professores.isEmpty()) {
            System.out.println("\nNenhum professor cadastrado. Voltando ao menu...");
        } else {
            System.out.print("\nCPF do professor a ser demitido: ");
            Long cpfDemitir = scanner.nextLong();
            scanner.nextLine();

            if (departamento.demitirProfessores(cpfDemitir)) {
                System.out.println("\nProfessor demitido com sucesso.");
            } else {
                System.out.println("\nProfessor não encontrado. Voltando ao menu...");
            }
        }
    }

    public void listarProfessores(Departamento departamento) {
        ArrayList<Professor> professores = departamento.informarProfessores();

        if (professores.isEmpty()) {
            System.out.println("\nNenhum professor cadastrado. Voltando ao menu...");
        } else {
            System.out.println("\nProfessores:");
            for (Professor professor : professores) {
                System.out.println(professor);
            }
        }
    }
}
