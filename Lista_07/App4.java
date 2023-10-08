package Lista_07;

public class App4 {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5,5,5,6,7,8,9,9};
        int entrada = 5;
        int contador=0;

        for(int i=0;i<num.length;i++){
            System.out.printf("%d | ", num[i]);
        }

        for(int i=1; i< num.length;i++){
            if(num[i] == entrada){
                contador++;
            }
        }

        System.out.println("O número " + entrada + " aparece " + contador + " vezes no array");
        
    }   
}
