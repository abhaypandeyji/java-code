public class ZClear{
    public static void cls(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}