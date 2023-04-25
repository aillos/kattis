import java.util.Scanner;

public class reversebinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        StringBuilder reversed = new StringBuilder();
        reversed.append(Integer.toBinaryString(x));
        reversed.reverse();
        System.out.println(Integer.parseInt(String.valueOf(reversed), 2));
    }
}
