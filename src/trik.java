import java.util.*;
import java.util.stream.IntStream;

public class trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int [] cup = {1, 2, 3};
        int n;
        for (int i=0; i< message.length();i++) {
            if (message.charAt(i)=='A') {
                n=cup[0];
                cup[0]=cup[1];
                cup[1]=n;
            }
            if (message.charAt(i)=='B') {
                n=cup[1];
                cup[1]=cup[2];
                cup[2]=n;
            }
            if (message.charAt(i)=='C') {
                n=cup[0];
                cup[0]=cup[2];
                cup[2]=n;
            }
        }
        int z=1;
        int finalN = z;
        int x = IntStream.range(0, cup.length)
                .filter(i -> finalN == cup[i])
                .findFirst().getAsInt();

        System.out.println(x+1);
        sc.close();
    }
}
