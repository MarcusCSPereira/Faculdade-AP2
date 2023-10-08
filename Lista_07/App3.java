package Lista_07;

import java.security.SecureRandom;

public class App3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        double soma=0;
        
        for(int i=0;i<numeros.length;i++){
            numeros[i] = new SecureRandom().nextInt(100);
        }
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + "| ");
        }
        for(int i=0;i<numeros.length;i++){
            soma += numeros[i];
        }

        double media = (double)(soma/numeros.length);

        System.out.println("A média dos elementos desse vetor é: " + media);
        

    }
}
