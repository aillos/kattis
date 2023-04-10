import java.util.*;

public class triarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] triangle = sc.nextLine().split(" ");
        int size = triangle.length;
        int[] tri = new int [size];

        for(int i=0; i<size; i++) {
            tri[i] = Integer.parseInt(triangle[i]);
        }
        double x=tri[0];
        double y=tri[1];
        System.out.println(x*y/2);
        sc.close();
    }
}
