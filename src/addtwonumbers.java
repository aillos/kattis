import java.util.*;

public class addtwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letters = sc.nextLine().split(" ");
        int x = Arrays.stream(letters)
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(x);

    }
}