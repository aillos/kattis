import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class acearbiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.nextLine();
        Set<String> total = new HashSet<>();
        String [] test = new String[2];
        int [] num = new int[lines*2];
        int count = 0;
        for (int i=0;i<lines;i++){
            test=sc.nextLine().split("-");
            int x = Integer.parseInt(test[i]);
            int y = Integer.parseInt(test[i+1]);

            if (i>2 && x!=Integer.parseInt(test[i-2]) && count%2!=0){
                System.out.println("error " + i);
            }
            count+=x+y;
        }
        System.out.println("ok");
    }
}
