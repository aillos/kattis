import java.util.Scanner;

public class different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
            long x = Long.parseLong(line[0]);
            long y = Long.parseLong(line[1]);

            if (x < y) {
                System.out.println(y - x);
            } else {
                System.out.println(x - y);
            }
        }
    }
}
