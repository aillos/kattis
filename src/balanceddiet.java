import java.util.Arrays;
import java.util.Scanner;

public class balanceddiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            int [] cans = new int[num];
            if (num == 0) break;
            for (int i=0;i<num;i++){
                cans[i]=sc.nextInt();
            }
            Arrays.sort(cans);
            int meal1=0;
            int meal2=0;
            for (int i=num-1;i>=0;i--){
                if (meal2<meal1){
                    meal2+=cans[i];
                } else {
                    meal1+=cans[i];
                }
            }
            System.out.println(meal1+ " " +meal2);
        }
    }
}
