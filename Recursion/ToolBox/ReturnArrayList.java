import java.util.ArrayList;

class ReturnArrayList{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
    
        System.out.println("jai shree krishna");
    
        int[] arr = {1,8,8,3,4,5,6,7,8,8};
        System.out.println(findAllIndex(arr, 8, 0));


        
        
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr,target,index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}