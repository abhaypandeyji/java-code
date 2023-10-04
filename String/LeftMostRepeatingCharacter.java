import java.util.Arrays;

class LeftMostRepeatingCharacter{
    public static void main(String[] args) {
        String str = "abbccda";

        int res = leftMostRepeatingCharacter(str);
        System.out.println("first repeating character is at index "+res);
    }
    static int leftMostRepeatingCharacter(String str){
        int[] fIndex = new int[256];
        Arrays.fill(fIndex,-1);
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<str.length();i++){
            int fi = fIndex[str.charAt(i)];
            if(fi == -1){
                fIndex[str.charAt(i)] = i;
            }
            else{
                res = Math.min(res, fi);
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }


}