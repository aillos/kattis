import java.util.Scanner;

public class anthonyanddiablo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double squareMeters = sc.nextDouble();
        double fence = sc.nextDouble();

        double radius = Math.sqrt(squareMeters/3.14);
        double circle = 2 * 3.14 * radius;

        if (circle <= fence){
            System.out.println("Diablo is happy!");
        } else {
            System.out.println("Need more materials!");
        }
    }
}
