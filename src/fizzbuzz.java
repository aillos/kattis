import java.util.*;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fizz = sc.nextInt();
        int buzz = sc.nextInt();
        int interval = sc.nextInt();
        int fizzBuzz = fizz*buzz;

        for (int i=1;i<=interval;i++) {
            if (i%fizzBuzz==0) {
                System.out.println("FizzBuzz");
            } else if (i%fizz==0) {
                System.out.println("Fizz");
            } else if (i%buzz==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}