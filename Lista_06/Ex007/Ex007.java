public class Ex007 {

    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1; // Caso base: quando o número tem um único dígito, retorna 1.
        } else {
            // Divide o número por 10 para remover o último dígito e chama a função recursivamente.
            int digitosRestantes = numero / 10;
            return 1 + contarDigitos(digitosRestantes);
        }
    }

    public static void main(String[] args) {
        int numero = 12345; // Você pode alterar o número para contar os dígitos de outro número.

        int quantidadeDeDigitos = contarDigitos(numero);
        System.out.println("O número " + numero + " possui " + quantidadeDeDigitos + " dígitos.");
    }
}
