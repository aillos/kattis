import java.util.Scanner;

public class almostperfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int total=1;
            int x = sc.nextInt();
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    total += i;
                    int otherFactor = x / i;
                    if (otherFactor != i) {
                        total += otherFactor;
                    }
                }
            }
            String output=" not perfect";
            if (total==x){
                output=" perfect";
            } else if (Math.abs(x - total) <= 2){
                output=" almost perfect";
            }
            System.out.println(x + output);
        }
    }
}
