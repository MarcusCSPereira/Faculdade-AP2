package Lista_07;

import java.security.SecureRandom;

public class App5 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int[] soma = new int[5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = new SecureRandom().nextInt(100);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%3d |", matriz[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma[i] += matriz[i][j];
            }
        }

        System.out.println();
        
        for (int i : soma) {
            System.out.print(i + "| ");
        }

    }
}
