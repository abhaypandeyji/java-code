public class BinarySearchUsingRecursion{
    public static void main(String[] args) {
        
        int[] arr = {1,2,4,7,8,12,13,14,34,56,78};
        int target = 13;
        int res = search(arr, target, 0, arr.length-1);
        System.out.println(res);

    }
    public static int search(int[] arr, int target, int s,int e){
        int mid = (s+e)/2;
        if(s>e){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return search(arr, target, s, mid-1);
        }
        else{
            return search(arr, target, mid + 1, e);
        }
        
    }
}