import java.util.*;

public class whichisgreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tall = sc.nextLine().split(" ");
        int [] x = Arrays.stream(tall).mapToInt(Integer::parseInt).toArray();
        int out;

        if (x[0] > x[1]){
            out=1;
        } else {
            out = 0;
        }
        System.out.println(out);



        sc.close();
    }
}
