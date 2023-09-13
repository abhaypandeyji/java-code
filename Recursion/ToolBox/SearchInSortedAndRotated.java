public class SearchInSortedAndRotated {
    public static void main(String[] args) {
        ZClear.cls();
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(search(arr, 9, 0, arr.length-1));
        
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = (s+e)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(arr[s]<=target && arr[e]>target){
                return search(arr, target, s, mid-1);
            }
            return search(arr, target, mid+1, e);
        }
        if(arr[mid]<target && target <= arr[e]){
            return search(arr, target, mid+1, e);
        }
        return search(arr, target, s, mid-1);




    }
 
}
