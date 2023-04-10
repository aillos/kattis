import java.util.*;

public class pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] z = new int[N];
        int [] y = new int[N*2];
        int X = 0;
        int j=0;
        for (int i=0; i<N;i++){
            z[i]+=sc.nextInt();
            y[j]= (int) Math.floor(z[i]/10);
            y[j+1]=(int) Math.floor(z[i]%10);
            j+=2;
        }

        for(int i=0; i<y.length;i+=2){
            X= (int) (X+Math.pow(y[i],y[i+1]));
        }
        System.out.println(X);
    }
}

