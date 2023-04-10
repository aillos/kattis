import java.util.*;

public class gcvwr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = 0.0;
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        a = (b - c) * 0.9;

        for (int i = 0; i < d; i++){
            int e = s.nextInt();
            a=a-e;
        }
        int f = (int) a;
        System.out.println(f);
    }
}