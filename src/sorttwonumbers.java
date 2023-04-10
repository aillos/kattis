import java.util.*;

public class sorttwonumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();

        if (a < b){
            System.out.println(a + " " + b);
        }
        else if (a > b){
            System.out.println(b + " " + a);
        } else {
            System.out.println(a + " " + b);
        }
    }
}