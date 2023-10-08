package Lista_07;

import java.security.SecureRandom;

public class App6 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz3 = new int[3][3];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = new SecureRandom().nextInt(10);
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = new SecureRandom().nextInt(10);
            }
        }
        
        imprimeMatriz(matriz1);
        imprimeMatriz(matriz2);

        for(int l=0;l<matriz3.length;l++){
            for(int c=0;c<matriz3.length;c++){
                for (int i = 0; i < matriz3.length; i++) {
                    matriz3[l][c] += matriz1[l][i]*matriz2[i][c]; 
                }
            }
        }

        imprimeMatriz(matriz3);

    }

    public static void imprimeMatriz(int[][] matriz){
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%3d |", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
