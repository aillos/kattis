import java.util.*;

public class batterup {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        float y = 0;
        int antall = 0;

        for (int i = 0; i < x; i++) {
            float z = s.nextInt();
            if (!(z == -1)) {
                y = y + z;
                antall++;
            }
        }
        System.out.println(y / antall);

    }
}