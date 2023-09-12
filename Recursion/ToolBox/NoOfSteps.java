public class NoOfSteps{
    public static void main(String[] args) {
        int n = 14;
        System.out.println(noOfSteps(n));

    }
    public static int noOfSteps(int n){
        return helper(n, 0);
    }
    public static int helper(int n, int s){
        if(n==0){
            return s;
        }
        s = s + 1;
        if(n%2==0){
            return helper(n/2, s);
        }
        else{
            return helper(n-1, s);
        }

    }
    
}
