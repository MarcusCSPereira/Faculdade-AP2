public class Ex001 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    public static long fatorial(int x){
        if(x==0){
            return 1;
        }else{
            return x*fatorial(x-1);
        }
    }
}
