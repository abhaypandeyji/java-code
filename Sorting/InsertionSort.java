import java.util.Arrays;
public class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,1,2,3,4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}