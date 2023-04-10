import java.util.*;

public class digitswap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b;
        int c;

        b = Integer.parseInt(Integer.toString(a).substring(0, 1));
        c = Integer.parseInt(Integer.toString(a).substring(1, 2));

        System.out.println(c+""+b);

    }

}