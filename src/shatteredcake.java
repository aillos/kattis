import java.util.*;

public class shatteredcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        int[] width = new int[N];
        int[] length = new int[N];
        String[] slice;
        int L=0;

        for (int i = 0; i < N; i++) {
            slice = sc.nextLine().split(" ");
            width[i] = Integer.parseInt(slice[0]);
            length[i] = Integer.parseInt(slice[1]);
            L=L+(length[i]*width[i]);
        }

        System.out.println(L/W);

        sc.close();
    }
}
