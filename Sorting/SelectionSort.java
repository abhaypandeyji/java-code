import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,6,5,4,3,2,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int min_ind = i;
            for(int j = i+1;j<n;j++){
                if(arr[min_ind]>arr[j]){
                    min_ind = j;
                }
            }
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
    }
}