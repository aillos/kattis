import java.util.*;

public class qaly{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        float y = 0;
        for (int i=0; i<x; i++){
            float a = s.nextFloat();
            float b = s.nextFloat();
            y = (y + (b*a));

        }
        System.out.println(y);

    }
}