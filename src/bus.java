import java.util.*;

public class bus{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int cases = sc.nextInt();

        for (int i=0;i<cases;i++){
            int stops = sc.nextInt();
            double start = 1.5;
            for (int j=1;j<stops;j++){
                start+=start+0.5;
            }
            int passengers=(int)start;
            System.out.println(passengers);
        }
    }
}