import java.util.*;

public class jobexpenses{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
        for (int i=0;i<num;i++){
            int x = sc.nextInt();
            if (x<0){
                total+=x;
            }
        }
        System.out.println(Math.abs(-total));
    }
}