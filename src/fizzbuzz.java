import java.util.*;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fizz = sc.nextInt();
        int buzz = sc.nextInt();
        int interval = sc.nextInt();

        for (int i=1;i<=interval;i++) {
            String value = "";
            if (i%fizz==0) {
                value += "Fizz";
            }
            if (i%buzz==0) {
                value += "Buzz";
            }
            if (value.isEmpty()) {
                value += i;
            }
            System.out.println(value);
        }
    }
}