package Lista_05.Ex006;

public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Marquinhos", 1, 7.5, 10.0, 2);
        	
        System.out.println(a1);

        System.out.println("Média: " + a1.calcularMedia());
    }
}
