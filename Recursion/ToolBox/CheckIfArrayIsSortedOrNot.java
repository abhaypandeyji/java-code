public class CheckIfArrayIsSortedOrNot{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,20,6,7,8,9};
        System.out.println(isSorted(arr, 0));

    }
    static boolean isSorted(int[] arr, int index){
        if(index==arr.length-2){
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr, index + 1);
    }
}