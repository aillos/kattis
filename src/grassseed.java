import java.util.*;

public class grassseed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C1 = sc.next();
        float C = Float.parseFloat(C1);
        int L = sc.nextInt();
        float sum = 0;
        sc.nextLine();

        for (int i=0; i<L; i++){
            String[] input = sc.nextLine().split(" ");
            float Width = Float.parseFloat(input[0]);
            float Length = Float.parseFloat(input[1]);

            sum = sum + (Width * Length * C);

        }

        System.out.println(sum);


    }

}