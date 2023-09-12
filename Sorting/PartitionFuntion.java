import java.util.Arrays;
public class PartitionFuntion{
    public static void main(String[] args) {
        int[] arr = {3,8,6,12,10,7};
        int pivot = 1;
        naivePartition(arr,pivot,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void naivePartition(int[] arr, int p, int l, int h) {
        int[] temp = new int[h-l+1];
        int index = 0;
        for(int i = 0;i<=h;i++){
            if(arr[i]<arr[p]){
                temp[index++] = arr[i];
            }
        }
        for(int i = 0;i<=h;i++){
            if(arr[i]>=arr[p]){
                temp[index++] = arr[i];
            }
        }
        System.out.println(arr[p]);
        for(int i = l;i<=h;i++){
            arr[i] = temp[i-l];
        } 
    }
    
}