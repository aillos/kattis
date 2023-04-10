import java.util.*;

public class fyi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();

        int firstDigit = Integer.parseInt(Integer.toString(b).substring(0, 3));
        if (firstDigit == 555){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}