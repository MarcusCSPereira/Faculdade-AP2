package Lista_07;

import java.util.concurrent.ThreadLocalRandom;

public class App2 {
    public static void main(String[] args) {
        double[] num = new double[10];
        double maior;

        for(int i=0;i<num.length;i++){
            num[i] = ThreadLocalRandom.current().nextDouble(1,10);
        }
        for(int i=0;i<num.length;i++){
            System.out.printf("%.2f | ", num[i]);
        }
        maior = num[0];
        for(int i=1; i< num.length;i++){
            if(num[i]> maior){
                maior=num[i];
            }
        }

        System.out.println("O maior numero desse Array é: " + maior);
        
    }   
}
