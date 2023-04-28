import java.util.Scanner;

public class ninenineproblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentPrice = sc.nextInt();
        int newPrice;
        if (currentPrice<100){
            System.out.println(99);
            return;
        }
        if (currentPrice%100!=0){
            int x = currentPrice/100*100;
            int y = currentPrice-x;
            if (y<49){
                y=-1;
            } else {
                y=99;
            }
            newPrice=x+y;
        } else {
            newPrice=currentPrice/100*100 - 1;
        }
        System.out.println(newPrice);
    }
}
