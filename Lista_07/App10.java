package Lista_07;

public class App10 {
    public static void main(String[] args) {

        int[][] matriz = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        imprimeMatriz(matriz, 3, 3);

        if (ehMatrizMagica(matriz)) {
            System.out.println("A matriz é uma matriz mágica.");
        } else {
            System.out.println("A matriz não é uma matriz mágica.");
        }

    }

    public static boolean ehMatrizMagica(int[][] matriz) {
        int ordem = matriz.length;
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        // Calcule a soma da diagonal principal e da diagonal secundária
        for (int i = 0; i < ordem; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][ordem - 1 - i];
        }

        // Verifique se a soma da diagonal principal é igual à soma da diagonal secundária
        if (somaPrincipal != somaSecundaria) {
            return false;
        }

        // Verifique se a soma das linhas e colunas são iguais à soma da diagonal principal
        for (int i = 0; i < ordem; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < ordem; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha != somaPrincipal || somaColuna != somaPrincipal) {
                return false;
            }
        }

        return true;
    }

    public static void imprimeMatriz(int[][] matriz, int linhas, int colunas) {
        System.out.println();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%3d |", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
