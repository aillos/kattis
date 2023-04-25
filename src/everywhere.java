import java.util.*;

public class everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i=0; i<a; i++){
            int b = sc.nextInt();

            Set<String> total = new HashSet<>();
            for (int j=0; j<b;j++){
                total.add(sc.next());
            }
            System.out.println(total.size());
        }

    }

}
