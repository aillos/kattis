import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class blueberrywaffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int stop = sc.nextInt();

        if(stop%2==0){
            System.out.println("up");
        } else {
            System.out.println("down");
        }
    }
}
