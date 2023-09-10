import java.util.Arrays;

public class UnionOfTwoSortedArray{
    public static void main(String[] args) {
        int[] arr1 = {1,5,6,8,12,14,19};
        int[] arr2 = {1,56,59,63,77,80,83,100};
        System.out.println(Arrays.toString(unionOfSortedArrays(arr1, arr2)));


    }
    public static int[] unionOfSortedArrays(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int i = 0,j = 0, c = 0;
        int[] res = new int[m+n];
        while(i<m && j<n){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(j>0 && arr1[j]==arr1[j-1]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                res[c++] = arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                res[c++] = arr2[j];
                j++;
            }
            else{
                res[c++] = arr1[i];
                i++;
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
