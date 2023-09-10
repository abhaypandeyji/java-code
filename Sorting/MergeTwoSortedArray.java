import java.util.Arrays;

public class MergeTwoSortedArray{
    public static void main(String[] args) {
        int[] arr1 = {1,5,6,8,12,14,19};
        int[] arr2 = {1,56,59,63,77,80,83,100};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
    
    public static int[] merge(int[] arr1, int[] arr2){
        
        int m = arr1.length;
        int n = arr2.length;
        int[] res = new int[m+n];
        int c = 0;
        int i = 0;
        int j = 0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                res[c++] = arr1[i];
                i++;
            }
            else{
                res[c++] = arr2[j];
                j++;
            }
        }
        while(i<m){
            res[c++] = arr1[i];
            i++;
        }
        while(j<n){
            res[c++] = arr2[j];
            j++;
        }
        return res;
    }
}