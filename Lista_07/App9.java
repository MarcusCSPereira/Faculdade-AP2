package Lista_07;

import java.security.SecureRandom;

public class App9 {
    public static void main(String[] args) {

        int[] num = new int[10];
        int maior, menor;

        for(int i=0;i<num.length;i++){
            num[i] = new SecureRandom().nextInt(100);
        }

        for(int i=0;i<num.length;i++){
            System.out.printf("%d | ", num[i]);
        }

        maior = num[0];
        menor = num[0];

        for(int i=1; i< num.length;i++){
           
            if(num[i]> maior){
                maior=num[i];
            }

            if(num[i] < menor){
                menor=num[i];
            }
        }

        System.out.println("\nO maior numero desse Array é: " + maior);
        System.out.println("O menor numero desse Array é: " + menor);
        
    }   
}
