package Lista_05.Ex009;

public class App {
    public static void main(String[] args) {
        Complexo c1 = new Complexo(3.0, 2.0);
        Complexo c2 = new Complexo(1.5, 4.0);
        Complexo c3 = new Complexo();

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        Complexo soma = c1.somar(c2);
        System.out.println("Soma de c1 e c2 = " + soma);

        boolean igual = c1.equals(c2);
        System.out.println("c1 é igual a c2? " + igual);
    }
}
