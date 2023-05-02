import java.util.Scanner;

public class ordinals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(ordinal(number));
    }

    public static String ordinal(int number) {
        StringBuilder result = new StringBuilder();
        result.append("{");

        for (int i = 0; i < number; i++) {
            result.append(ordinal(i));
            if (i != number - 1) {
                result.append(",");
            }
        }

        result.append("}");
        return result.toString();
    }
}
