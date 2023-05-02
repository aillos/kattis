import java.util.*;

public class oddities{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int amount = sc.nextInt();
        for (int i=0; i<amount; i++){
            int num = sc.nextInt();
            String result = "odd";
            if (num%2==0){
                result="even";
            }
            System.out.println(num+" is " + result);
        }
    }
}