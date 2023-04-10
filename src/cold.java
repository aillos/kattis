import java.util.*;

public class cold {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[]b=new int[a];
        int antall=0;

        for (int i=0; i<a; i++){
            int value = s.nextInt();
            b[i] = value;
        }
        for (int i=0; i<b.length;i++){
            if (b[i] < 0 ){
                antall++;
            }
        }
        System.out.println(antall);
    }
}