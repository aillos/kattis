import java.util.Arrays;
import java.util.Scanner;

public class classfieldtrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ann = sc.nextLine();
        String ben = sc.nextLine();
        String total = ben+ann;
        char[] triplist = total.toCharArray();
        Arrays.sort(triplist);
        for (int i=0;i<triplist.length;i++){
            System.out.print(triplist[i]);
        }
    }
}