import java.util.*;

public class undeadoralive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        String[] lookFor = {":)", ":(", "test"};
        String[] output = {"alive", "undead", "double agent", "machine"};
        int x=3;
        if (message.indexOf(lookFor[0]) != -1) {
            x=0;
        }
        if (message.indexOf(lookFor[1]) != -1) {
            x = 1;
        }
        if (message.indexOf(lookFor[0]) != -1 && message.indexOf(lookFor[1]) != -1) {
            x = 2;
        }
        System.out.println(output[x]);
        sc.close();
    }
}
