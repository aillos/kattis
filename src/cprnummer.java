import java.util.Scanner;

public class cprnummer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");
        int[] numbers = new int[input.length];
        int[] multiply = {4, 3, 2, 7, 6, 5, 0, 4, 3, 2, 1};
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("-")) {
                continue;
            } else {
                numbers[i] = Integer.parseInt(input[i]);
                total = total + (numbers[i] * multiply[i]);
            }
        }

        if (total % 11 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}