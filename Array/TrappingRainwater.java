package array;

public class TrappingRainwater {
    // calculate TrappingRainwater using Prefix array (Time complexity - O(n) & Space complexity- O(n))
    public static void TrappingRainWaterPrefix(int height[]){
        int n=height.length;
        // Calculate Left maximum boundary
        int LeftMax[]= new int [n];
        LeftMax[0]=height[0];
        for(int i=1;i<n;i++){
            LeftMax[i]=Math.max(height[i], LeftMax[i-1]);
        }
        // Calculate Right maximum boundary
        int RightMax[]= new int[n];
        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i], RightMax[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            // waterlevel =min(left max boundary , right max boundary)
            int waterlevel=Math.min(LeftMax[i], RightMax[i]);
            // trappedwater =(waterlevel - height) 
           trappedwater += (waterlevel-height[i]);
        }
        System.out.println("Total TrappedWater : "+trappedwater);
    }
     // calculate TrappingRainwater By Two pointers approach (Time complexity - O(n) & Space complexity- O(1))
    public static void TrappingRainWaterTwopointers(int height[]) {

    int left = 0;
    int right = height.length - 1;

    int leftMax = 0;
    int rightMax = 0;

    int trappedWater = 0;

    while(left < right) {

        if(height[left] < height[right]) {

            if(height[left] >= leftMax) {
                leftMax = height[left];
            } else {
                trappedWater += leftMax - height[left];
            }

            left++;

        } else {

            if(height[right] >= rightMax) {
                rightMax = height[right];
            } else {
                trappedWater += rightMax - height[right];
            }

            right--;
        }
    }

    System.out.println("Total Trapped Water : " + trappedWater);
}
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        TrappingRainWaterPrefix(height);
        TrappingRainWaterTwopointers(height);
    }
}
