import java.util.HashSet;
import java.util.Scanner;

public class princesspeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalObstacles = sc.nextInt();
        int foundObstacles = sc.nextInt();
        HashSet<Integer> found = new HashSet<>();
        for (int i=0;i<foundObstacles;i++){
            found.add(sc.nextInt());
        }
        for (int i=0; i<totalObstacles; i++){
            if (!found.contains(i)){
                System.out.println(i);
            }
        }
        System.out.println("Mario got " + found.size() + " of the dangerous obstacles.");
    }
}
