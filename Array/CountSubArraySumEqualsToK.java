public class CountSubArraySumEqualsToK {
    // BruteForce Approach 
    //Time Complexity - O(n^3)
    public static int bruteforce(int arr[],int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int m=i;m<=j;m++){
                    sum+=arr[m];
                }
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    // Better Approach 
    //Time Complexity - O(n^2)
    public static int betterSolution(int arr[],int k){
     int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    // Optimal Solution using HashMap
    //Time Complexity - O(n)
    //Space Complexity - O(n)
    public static boolean linearSearch(int prefix[],int sum){
        for(int i=0;i<prefix.length;i++){
            if(prefix[i]==sum){
                return true;
            }
        }
        return false
        ;
    }
    public static int optimalSolution(int arr[],int k){
        int count = 0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
    for(int i=0;i<prefix.length;i++){
        int sum=prefix[i]-k;
        if(sum==0){
            count++;
        }else if(linearSearch(prefix, sum)){
            count++;
        }
    }
return count;
    }
public static void main(String[] args) {
        int arr[]={3,1,2,4};
        // System.out.println(bruteforce(arr, 6));
      //  System.out.println(betterSolution(arr, 4));
      System.out.println(optimalSolution(arr, 2));
    }
}
