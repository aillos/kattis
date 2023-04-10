import java.util.*;

public class tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X= sc.nextInt();
        int N=sc.nextInt();
        int Y=(N+1)*X;
        for (int i=0;i<N;i++){
            Y=Y-sc.nextInt();
        }
        System.out.println(Y);
    }
}
