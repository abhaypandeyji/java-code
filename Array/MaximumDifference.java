import java.util.Arrays;

class MaximumDifference{
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maximumDifference(arr));
    }
    public static int maximumDifference(int[] arr){
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        int min = arr[0];
        for(int i = 1;i<n;i++){
            res =  Math.max(res, arr[i] - min);
            min = Math.min(min, arr[i]);
        }
        return res;
    }
}