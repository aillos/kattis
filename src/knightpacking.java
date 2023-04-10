import java.util.*;

public class knightpacking{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = x*x;

        if (y%2==0) {
            System.out.println("second");
        } else {
            System.out.println("first");
        }
    }


}