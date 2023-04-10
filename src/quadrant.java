import java.util.*;

public class quadrant{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        if (x > 0 && y > 0){
            System.out.println(1);
        } else if (x < 0 && y > 0){
            System.out.println(2);
        } else if (x > 0 && y < 0){
            System.out.println(4);
        } else if (x < 0 && y < 0){
            System.out.println(3);
        }

    }
}