import java.util.*;

public class nsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] c = new int[a];
        int x=0;
        sc.nextLine();
        String[]b=sc.nextLine().split(" ");

        for (int i=0; i<a;i++){
            c[i]=Integer.parseInt(b[i]);
            x=x+c[i];
        }

        System.out.println(x);
    }

}
