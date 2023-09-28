package Lista_05.Ex004;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto("Nesquik",10.0,5);

        p1.adicionarAoEstoque(3);
        p1.retirarDoEstoque(2);

        System.out.println(p1.getValorTotalEmEstoque() + " R$");
    }
}
