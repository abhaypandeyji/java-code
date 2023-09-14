//package Searching.ClassQuestion;

public class SearchInSortedAndRotated {
    public static void main(String[] args) {
        ZClear.cls();
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(searchInSortedAndRotated(arr, 9));
    }
    public static int searchInSortedAndRotated(int[] arr, int target){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (l + r)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[l]<=arr[mid]){
                if(target >= arr[l] && target < arr[mid]){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            else{
                if(target > arr[mid] && target <= arr[r]){
                    l = mid + 1;
                } 
                else{
                    r = mid - 1;
                }
            }
            
        }
        return -1;
    }
    
}
