package Lista_11.view;

import javax.swing.JOptionPane;

import Lista_11.controller.*;
import Lista_11.model.*;

public class BancoApp {
    public static void main(String[] args) {

        int op;
        ControleConta cConta = new ControleConta();
        ControleCliente cCliente = new ControleCliente();
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));

        while (op != 0) {
            switch (op) {
                case 1: {// criar conta
                    long cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do cliente:"));
                    Cliente c = cCliente.pesquisarCliente(cpf);
                    if (c != null) {
                        cConta.cadastrarConta(c);
                        JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "CPF inválido");
                    }
                    break;
                }
                case 2: {// depositar
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
                    Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito:"));
                    cConta.depositar(numConta, valor);
                    JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
                    break;
                }
                case 3: { // sacar
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                    if (cConta.sacar(numConta, valor)) {
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
                    } else
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    break;
                }
                case 4: {// consultar saldo
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
                    JOptionPane.showMessageDialog(null,
                            "Conta: " + numConta + "\nSaldo: " + cConta.consultarSaldo(numConta));
                    break;
                }
                case 5: {// mostrar histórico
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
                    JOptionPane.showMessageDialog(null,
                            cConta.mostrarHistorico(numConta));
                    break;
                }
                case 6: { // imprimir contas
                    JOptionPane.showMessageDialog(null, cConta.imprimirContas());
                    break;
                }
                case 7: {// Cadastrar Cleinte
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    long cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF:"));
                    cCliente.cadastrarCliente(nome, cpf);
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                }
            }
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }

    public static String menu() {
        return "Banco AP2\n\n" +
                "1-Criar Conta\n" +
                "2-Depositar Valor\n" +
                "3-Sacar Valor\n" +
                "4-Consultar Saldo\n" +
                "5-Mostrar Histórico\n" +
                "6-Imprimir Contas\n" +
                "7-Cadastrar Cliente\n" +
                "0-Finalizar\n\n" +
                "Digite a opção desejada:";
    }

}