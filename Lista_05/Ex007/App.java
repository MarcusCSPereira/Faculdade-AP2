package Lista_05.Ex007;

public class App {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1200.00);

        c1.depositar(500);
        c1.sacar(200);
        System.out.println(c1.verificarSaldo());

        System.out.println(c1);

    }
}
