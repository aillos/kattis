import java.util.*;

public class electricaloutlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=0; i<N; i++){
            int K = sc.nextInt();
            int out=1;
            for (int j=0;j<K;j++){
                out=out + sc.nextInt()-1;
            }
            System.out.println(out);
        }
    }

}