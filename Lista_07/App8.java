package Lista_07;

import java.security.SecureRandom;

public class App8 {
    public static void main(String[] args) {
        int tamanho1=3, tamanho2 =2;

        int[][] matriz1 = new int[tamanho1][tamanho2];
        int[][] matrizt = new int[tamanho2][tamanho1];

        for (int i = 0; i < tamanho2; i++) {
            for (int j = 0; j < tamanho2; j++) {
                matriz1[i][j] = new SecureRandom().nextInt(10);
            }
        }
        
        imprimeMatriz(matriz1,tamanho1,tamanho2);


        for (int i = 0; i < tamanho2; i++) {
            for (int j = 0; j < tamanho1; j++) {
                matrizt[i][j] = matriz1[j][i];
            }
        }

        imprimeMatriz(matrizt,tamanho2,tamanho1);



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
