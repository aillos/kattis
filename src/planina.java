import java.util.*;

public class planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = (int) (Math.pow(2,X)+1);
        System.out.println(Y*Y);
    }

}