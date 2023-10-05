public class Ex003 {
    public static void main(String[] args) {
        System.out.println(potencia(2, 3));
    }

    public static long potencia(int x, int y){
        if(y==0){
            return 1;
        }else{
            return x*potencia(x, y-1);
        }
    }
}
