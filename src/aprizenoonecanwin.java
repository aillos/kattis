import java.util.Arrays;
import java.util.Scanner;

public class aprizenoonecanwin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numItems = sc.nextInt();
        int offerLimit = sc.nextInt();
        int [] items = new int[numItems];

        for (int i=0;i<numItems;i++){
            items[i] = sc.nextInt();
        }

        Arrays.sort(items);

        if (numItems == 1) {
            System.out.println("1");
        } else if (items[numItems-1] + items[numItems-2] <= offerLimit) {
            System.out.println(numItems);
        } else {
            for (int i = 0; i < numItems-1; i++) {
                if (items[i] + items[i+1] > offerLimit) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
