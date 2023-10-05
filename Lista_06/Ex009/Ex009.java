public class Ex009 {

    public static int somaArrayRecursivo(int[] array, int indice) {
        // Caso base: quando o índice for igual ao comprimento do array, a soma é 0.
        if (indice == array.length) {
            return 0;
        } else {
            // Chama a função recursivamente para somar os elementos a partir do próximo índice.
            return array[indice] + somaArrayRecursivo(array, indice + 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Você pode alterar o array para calcular a soma de outros elementos.

        int soma = somaArrayRecursivo(array, 0);
        System.out.println("A soma dos elementos do array é: " + soma);
    }
}
