import java.util.Arrays;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[3];
        for (int i=0;i<3;i++){
            numbers[i]=sc.nextInt();
        }
        Arrays.sort(numbers);

        String order = sc.next();
        int [] sorted = new int[3];
        for (int i=0;i<order.length();i++){
            if (order.charAt(i)=='A'){
                sorted[i]=numbers[0];
            } else if (order.charAt(i)=='C'){
                sorted[i]=numbers[2];
            } else {
                sorted[i]=numbers[1];
            }
        }

        System.out.println(sorted[0] + " " + sorted[1] + " " +sorted[2]);
    }
}
