import java.util.Scanner;

public class dicecup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int dice1 = Integer.parseInt(nums[0]);
        int dice2 = Integer.parseInt(nums[1]);
        int center = (dice1 + dice2) / 2;
        int difference=0;
        if (dice1<dice2) difference=(dice2-dice1)/2;
        if (dice1>dice2) difference=(dice1-dice2)/2;
        int start = center - difference + 1;
        int stop = center + difference + 2;

        if((dice1 + dice2) % 2 != 0) {
            stop++;
        }
        for(int i = start; i < stop; i++) {
            System.out.println(i);
        }
    }
}