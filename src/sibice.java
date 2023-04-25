import java.util.Scanner;

public class sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matches = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        double x = Math.sqrt(width * width + height * height);

        for (int i = 0; i < matches; i++) {
            if (x >= sc.nextInt()) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}