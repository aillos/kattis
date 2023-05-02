import java.util.Scanner;

public class codetosavelives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());
        for (int i=0;i<lines;i++){
            int sum = 0;
            for (int j=0;j<2;j++) {
                String[] numbers = sc.nextLine().split(" ");
                String concatenated = "";
                for (int k=0;k<numbers.length;k++){
                    concatenated += Integer.parseInt(numbers[k]);
                }
                int x = Integer.parseInt(concatenated);
                sum += x;
            }
            String[] digits = Integer.toString(sum).split("");
            for (int k=0;k<digits.length;k++){
                System.out.print(digits[k] + " ");
            }
        }
    }
}
