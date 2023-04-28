import java.util.*;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fizzNum = sc.nextInt();
        int buzzNum = sc.nextInt();
        int interval = sc.nextInt();
        String output;
        String fizz = "Fizz";
        String buzz = "Buzz";

        for (int i=1; i<=interval; i++){
            if (i%fizzNum==0 && i%buzzNum==0) output=fizz+buzz;

            else if (i%fizzNum==0) output=fizz;

            else if (i%buzzNum==0) output=buzz;

            else output=""+i;

            System.out.println(output);
        }

    }

}