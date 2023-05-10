import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class blueberrywaffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double seconds = sc.nextInt();
        double stop = sc.nextInt();

        if(Math.round(stop/seconds)%2==0){
            System.out.println("up");
        } else {
            System.out.println("down");
        }
    }
}
