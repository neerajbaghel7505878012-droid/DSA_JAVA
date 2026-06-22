public class MergeSortedArray {
    public static void mergeUsingTemp(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
       int temp[]=new int[n+m]; 
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                temp[k++]=nums1[i];
                i++;
            }else{
               temp[k++]=nums2[j];
               j++;
               }
              
        }
         while(i<m){
               temp[k++]=nums1[i];
               i++;
               }
               while(j<n){
                temp[k++]=nums2[j];
                j++;
               }
               for(int l=0;l<(m+n);l++){
                nums1[l]=temp[l];
               }


    }
    public static void main(String[] args) {
        int num1[]={1,2,3,0,0,0};
        int num2[]={1,2,3};
        mergeUsingTemp(num1, 3, num2, 3);
        for(int i :num1){
            System.out.print(i+"  ");
        }
    }
}
