import java.util.*;
class Radha{
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        System.out.println(a+b);
        System.out.println("Jai shree Krisha bolo jai Radhe");
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        String str = "apple";
        for(int i = 0;i<str.length();i++){
            hs.add(str.charAt(i));
        }
        System.out.println(hs);
    }
}