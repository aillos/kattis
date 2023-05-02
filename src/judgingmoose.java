import java.util.*;

public class judgingmoose{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int total=0;
        String output = "Not a moose";

        if (left>right){
            total=left*2;
        } else {
            total=right*2;
        }
        if (total<1){}
        else if (left!=right){
            output="Odd " + total;
        } else {
            output="Even " + total;
        }

        System.out.println(output);
    }
}