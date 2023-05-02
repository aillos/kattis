import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class acearbiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.nextLine();
        Set<String> total = new HashSet<>();
        String[] test = new String[lines];
        int[] num = new int[lines * 2];
        int count = 0;
        int toInt1 = 0;
        int toInt2 = 0;
        for (int i = 0; i < lines; i++) {
            test[i] = sc.nextLine();

            if (i > 0) {
                toInt1 = Integer.parseInt(test[i].substring(0, test[i].indexOf("-")));
                toInt2 = Integer.parseInt(test[i].substring(test[i].indexOf("-")+1));
                int x =Integer.parseInt(test[i - 1].substring(0, test[i - 1].indexOf("-")));
                int y = Integer.parseInt(test[i - 1].substring(test[i-1].indexOf("-")+1));
                System.out.println(toInt1 + " " + toInt2);
                System.out.println(x + " " + y);
                System.out.println((toInt1+toInt2)%2);
                if (toInt1 != x && (x + y) % 2 != 0 && toInt2 != y) {
                    System.out.println("error " + i+1);
                }
            }
        }

        System.out.println("ok");
    }
}