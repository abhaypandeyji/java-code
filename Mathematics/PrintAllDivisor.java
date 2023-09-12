package Mathematics;

public class PrintAllDivisor {
    public static void main(String[] args) {
        int n = 12;
        printAllDivisor(n);
        printAllDivisorInAscending(n);
    }
    static void printAllDivisor(int n){
        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i != i){
                    System.out.print(n/i+" ");
                }

            }
        }
        System.out.println();
    }
    static void printAllDivisorInAscending(int n){
        int i = 0;
        for(i = 1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        i = i-1;
        for(;i>=1;i--){
            if(n%i == 0 && n/i != i){
                System.out.println(n/i);
            }
        }
    }
}
