package array;

public class Movezeros {
    public static void MoveZeros(int arr[]){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[index];
                   arr[index]=arr[i];
                   arr[i]=temp;
                   index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,0,2,3};
        MoveZeros(arr);
    }
}
