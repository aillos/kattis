import java.util.*;

public class betting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        float y = x;

        float optEn;
        float optTo;

        optTo = y / (100-y) + 1;
        optEn = (100-y) / y + 1;

        System.out.println(optEn);
        System.out.println(optTo);
    }
}