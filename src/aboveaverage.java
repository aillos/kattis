import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class aboveaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i=0;i<cases;i++){
            int total = sc.nextInt();
            double avg=0;
            double count=0;
            int[] grades = new int[total];
            for (int j=0;j<total;j++){
                grades[j]=sc.nextInt();
                avg+=grades[j];
            }
            avg=avg/total;
            for (int j=0;j<total;j++){
                if (grades[j]>avg){
                    count++;
                }
            }
            count=count/total*100;
            BigDecimal aboveAvg = new BigDecimal(Double.toString(count));
            aboveAvg = aboveAvg.setScale(3, RoundingMode.HALF_UP);
            System.out.println(aboveAvg+"%");
        }
    }
}
