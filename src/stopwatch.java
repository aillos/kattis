import java.util.*;

public class stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X= sc.nextInt();
        int [] times = new int [X];
        int Y=0;

        for (int i=0; i<X; i++){
            times[i]=sc.nextInt();
        }

        if (X%2!=0) {
            System.out.println("still running");
        } else {
            for (int i = 1; i <= X; i += 2) {
                Y = Y + (times[i] - times[i - 1]);
            }
            System.out.println(Y);
        }

    }
}
