import java.util.*;

public class heartrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<num; i++){
            String [] input = sc.nextLine().split(" ");
            int beats = Integer.parseInt(input[0]);
            float time = Float.parseFloat(input[1]);

            float BPM = beats * 60 / time;
            float minABPM = BPM - (60/time);
            float maxABPM = BPM + (60/time);

            System.out.println(minABPM + " " + BPM + " " + maxABPM);
        }

    }

}