import java.util.*;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);

        for (int i=1; i<=N; i++){
            if (i%X==0 && i%Y==0){
                System.out.println("FizzBuzz");
            }
            else if (i%X==0){
                System.out.println("Fizz");
            }
            else if (i%Y==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

}