import java.util.*;

public class jackolanternjuxtaposition{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 3;
        int z = 1;
        for (int i=0; i<x; i++){
            int y = s.nextInt();
            z=z*y;
        }

        System.out.println(z);
    }
}