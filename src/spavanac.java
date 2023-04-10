import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] timeString = sc.nextLine().split(" ");
        int [] time = new int [timeString.length];
        for (int i=0;i< time.length; i++){
            time[i]+=Integer.parseInt(timeString[i]);
        }
        if (time[0]==0) time[0]=24;
        int x = time[0]*60 + time[1];
        double y = x-45;
        double z = y/60;

        BigDecimal cut = new BigDecimal(z);
        BigDecimal cutted = cut.setScale(5, RoundingMode.DOWN);
        int a = cutted.intValue();

        double b = (z-a)*60;
        BigDecimal cut2 = new BigDecimal(b);
        BigDecimal cutted2 = cut2.setScale(5, RoundingMode.UP);
        int c = cutted2.intValue();

        System.out.println(a + " "+c);
    }
}
