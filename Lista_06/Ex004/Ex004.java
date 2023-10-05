public class Ex004 {
    public static void main(String[] args) {
        System.out.println(somaDosDigitos(123));
    }
    public static int somaDosDigitos(int numero) {
        if (numero < 10) {
            return numero; // Caso base: quando o número tem apenas um dígito, retorna ele mesmo.
        } else {
            // Divide o número em dígito da direita (unidade) e dígitos restantes (dezenas, centenas, etc.).
            int ultimoDigito = numero % 10;
            int digitosRestantes = numero / 10;
            
            // Chama a função recursivamente para calcular a soma dos dígitos dos números restantes.
            int somaRestante = somaDosDigitos(digitosRestantes);
            
            // Retorna a soma do último dígito com a soma dos dígitos dos números restantes.
            return ultimoDigito + somaRestante;
        }
    }
}
