import java.util.Arrays;
//variation of this question are :
//1. move zeros to end  
//2. move even no to the end
//3. move odd no to the end 

public class MoveAllZeroToTheEnd{
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 4, 0, 3, 1, 0, 4};
        System.out.println(Arrays.toString(moveAllZerosToEnd(arr)));
    }
    public static int[] moveAllZerosToEnd(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
        return arr;
    }
}