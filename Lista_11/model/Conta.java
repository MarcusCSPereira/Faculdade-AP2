package Lista_11.model;

import java.util.ArrayList;

public class Conta {
    // atributos
    private int numeroConta;
    private Cliente cliente;
    private double saldo;
    private ArrayList<String> historico;
    private static int identificador = 0;

    // Construtores
    public Conta() {
        numeroConta = ++identificador;
        historico = new ArrayList<String>();
    }

    public Conta(Cliente cliente) {
        numeroConta = ++identificador;
        this.cliente = cliente;
        this.saldo = 0.0;
        historico = new ArrayList<String>();
    }

    public Conta(Cliente c, double saldo) {
        numeroConta = ++identificador;
        this.cliente = c;
        this.saldo = saldo;
        historico = new ArrayList<String>();
    }

    // métodos
    public int getNumeroConta() {
        return numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            historico.add("Depositou R$ " + valor);
        }
    }

    public boolean sacar(double valor) {
        if (getSaldo() >= valor && valor > 0) {
            setSaldo(getSaldo() - valor);
            historico.add("Sacou R$ " + valor);
            return true;
        }
        return false;
    }

    public double consultarSaldo() {
        return getSaldo();
    }

    public void setCliente(Cliente c) {
        this.cliente = c;
    }

    public String mostrarHistorico() {
        String s = "";
        for (int i = 0; i < historico.size(); i++)
            s = s + historico.get(i) + "\n";
        return s;
    }

    @Override
    public String toString(){
        return "Número da conta: " + numeroConta + "\n" +
                "Saldo: " + saldo + "\n";
    }
}