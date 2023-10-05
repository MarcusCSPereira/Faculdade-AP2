public class Ex010 {

    public static int encontrarMaior(int[] array, int indice, int maior) {
        // Caso base: quando o índice for igual ao comprimento do array, retorna o maior valor encontrado.
        if (indice == array.length) {
            return maior;
        } else {
            // Compara o elemento no índice atual com o maior valor atual.
            if (array[indice] > maior) {
                maior = array[indice];
            }
            
            // Chama a função recursivamente para encontrar o maior elemento a partir do próximo índice.
            return encontrarMaior(array, indice + 1, maior);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 7, 9, 2, 8, 6}; // Você pode alterar o array para encontrar o maior elemento em outros arrays.

        int maior = encontrarMaior(array, 0, Integer.MIN_VALUE);
        System.out.println("O maior elemento no array é: " + maior);
    }
}
