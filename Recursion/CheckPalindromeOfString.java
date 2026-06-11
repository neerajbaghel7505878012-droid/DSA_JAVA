public class CheckPalindromeOfString {
    public static boolean fun(String s,int i){
       if(i>=(s.length()/2)) return true;
       if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

       return fun(s, i+1);
    }
    public static void main(String[] args) {
        String s="121";
        System.out.println(fun(s, 0));
    }
    
}
