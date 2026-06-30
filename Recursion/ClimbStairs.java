public class ClimbStairs {
    public static int climbStairs(int n){
      if(n<=3)return n;
     int last= climbStairs(n-1);
     int slast= climbStairs(n-2);
       return last+slast;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
