import java.util.*;
class HashSetBasics{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 1;i<11;i++){
            hs.add(i);
        }
        System.out.println(hs);
    }
}