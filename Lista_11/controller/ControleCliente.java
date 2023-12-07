package Lista_11.controller;

import java.util.ArrayList;

import Lista_11.model.Cliente;

public class ControleCliente {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(String nome, long cpf) {
        clientes.add(new Cliente(nome, cpf));
    }

    public Cliente pesquisarCliente(long cpf) {
        Cliente c = null;
        for (Cliente cli : clientes) {
            if (cli.getCpf() == cpf) {
                c = cli;
                break;
            }
        }
        return c;
    }
}