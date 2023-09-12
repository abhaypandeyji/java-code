
import java.util.ArrayList;

public class Searching{
    public static void main(String[] args) {
        int[] arr = {1,2,3,21,21,4,35,21,20,43,14,17};
        int target = 21;
        System.out.println(search(arr, target,0));
        System.out.println(searchAndReturn(arr, target, 0, new ArrayList<Integer>()));
    }
    static boolean search(int[] arr, int target, int index){
        if(index==arr.length-1){
            return false;
        }
        return target==arr[index] || search(arr, target, index+1);
    }
    static ArrayList<Integer> searchAndReturn(int[] arr, int target, int index, ArrayList<Integer> ls){
        if(index==arr.length-1){
            return ls;
        }
        if(target==arr[index]){
            ls.add(index);
        }
        return searchAndReturn(arr, target, index+1,ls);
    }
}