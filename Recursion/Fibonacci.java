public class Fibonacci {
    public static int fun(int n){
     if(n<=1){
        return n;
     }
     int last=fun(n-1);
     int slast= fun(n-2);
     return last+slast;
    }
    public static void main(String[] args) {
        System.out.println(fun(4));
    }
}
