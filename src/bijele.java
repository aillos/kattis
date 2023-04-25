import java.util.Scanner;

public class bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] correct = {1,1,2,2,2,8};
        String [] input = sc.nextLine().split(" ");
        int [] current = new int[correct.length];
        for (int i=0; i<input.length;i++){
            current[i] = correct[i]-Integer.parseInt(input[i]);
            System.out.print(current[i] + " ");
        }
    }
}