import java.util.*;

public class zoom{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int interval = sc.nextInt();
        int[] numbers = new int[num];

        for (int i=0;i<num;i++){
            numbers[i]=sc.nextInt();
        }

        num=num/interval;

        for (int i=1;i<=num;i++){
            System.out.print(numbers[(i*interval)-1]+" ");
        }
    }
}