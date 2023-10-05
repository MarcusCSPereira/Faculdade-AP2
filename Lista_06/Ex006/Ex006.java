public class Ex006 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int alvo = 5; // O elemento que você deseja encontrar no array.
    
        int resultado = buscaBinariaRecursiva(array, alvo, 0, array.length - 1);
    
        if (resultado != -1) {
            System.out.println("Elemento " + alvo + " encontrado na posição " + resultado);
        } else {
            System.out.println("Elemento " + alvo + " não encontrado no array.");
        }
    }
    
    public static int buscaBinariaRecursiva(int[] array, int alvo, int inicio, int fim) {
        if (inicio > fim) {
            return -1; // O elemento não foi encontrado no array.
        }

        int meio = (inicio + fim) / 2;

        if (array[meio] == alvo) {
            return meio; // Elemento encontrado na posição 'meio'.
        } else if (array[meio] < alvo) {
            // Chama a função recursivamente na metade direita do array.
            return buscaBinariaRecursiva(array, alvo, meio + 1, fim);
        } else {
            // Chama a função recursivamente na metade esquerda do array.
            return buscaBinariaRecursiva(array, alvo, inicio, meio - 1);
        }
    }

}
