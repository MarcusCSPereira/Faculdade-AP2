package Lista_07;

import java.security.SecureRandom;

public class App7 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int somaPrin=0,somaSec=0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = new SecureRandom().nextInt(10);
            }
        }
        
        imprimeMatriz(matriz1);

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if(i==j){
                    somaPrin+=matriz1[i][j];
                }
            }
        }


        System.out.println("A soma da diagonal principal dessa matriz é: "+ somaPrin);

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if (i == matriz1.length - 1 - j) {
                    somaSec+=matriz1[i][j];
                }
            }
        }
    
        System.out.println("A soma da diagonal secundária dessa matriz é: " + somaSec);



    }

    public static void imprimeMatriz(int[][] matriz){
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%3d |", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
