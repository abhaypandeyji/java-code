public class CountNoOfZeros{
    public static void main(String[] args) {
        int n = 10209000;
        System.out.println(countNoOfZeros(n));

    }
    public static int countNoOfZeros(int n){
        if(n==0){
            return 0;
        }
        int s = n%10==0?1:0;
        return s + countNoOfZeros(n/10);
    }
}