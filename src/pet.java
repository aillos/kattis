import java.util.*;

public class pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largestIndex = 0, largest = 0;

        for(int x = 1; x <= 5; x++){
            int xSum = 0;
            for(int i = 0; i < 4; i++) xSum += sc.nextInt();

            if(largest < xSum){
                largest = xSum;
                largestIndex = x;
            }
        }

        System.out.printf(largestIndex + " " + largest);
    }

}