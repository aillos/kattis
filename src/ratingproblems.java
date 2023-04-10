import java.util.*;

public class ratingproblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] judges = sc.nextLine().split(" ");
        int n = Integer.parseInt(judges[0]);
        int k = Integer.parseInt(judges[1]);
        float rating=0;
        for (int i=0; i<k; i++){
            rating=rating+sc.nextInt();
        }

        float max=(n-k)*3;
        float min=(n-k)*-3;
        System.out.println((rating+min)/n);
        System.out.println((rating+max)/n);
        sc.close();
    }
}
