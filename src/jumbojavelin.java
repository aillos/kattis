import java.util.*;
public class jumbojavelin{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int z = 0;
        for (int i=0; i<x; i++){
            int y = s.nextInt();
            z = z + y;
        }
        z = z - (x-1);

        System.out.println(z);
    }


}