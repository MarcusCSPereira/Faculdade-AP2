package Lista_05.Ex010;

public class App {
    public static void main(String[] args) {

        Equaciona equacao1 = new Equaciona(1.0, -3.0, 2.0);
        Equaciona equacao2 = new Equaciona(0, 2.0, 1.0);
        Equaciona equacao3 = new Equaciona(1.0, 0, 25.0);
        System.out.println("Equação 1: " + equacao1.resolverEquacaoSegundoGrau());
        System.out.println("Equação 2: " + equacao2.resolverEquacaoSegundoGrau());
        System.out.println("Equação 3: " + equacao3.resolverEquacaoSegundoGrau());

    }
}
