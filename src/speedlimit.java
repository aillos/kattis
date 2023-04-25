import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class speedlimit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int lines = Integer.parseInt(br.readLine());
            if (lines == -1) break;

            int[] miles = new int[lines];
            int[] hours = new int[lines];
            int total = 0;
            for (int i = 0; i < lines; i++) {
                String [] input = br.readLine().split(" ");
                miles[i] = Integer.parseInt(input[0]);
                hours[i] = Integer.parseInt(input[1]);
                if (i > 0) {
                    total += miles[i] * (hours[i] - hours[i - 1]);
                } else {
                    total += miles[i] * hours[i];
                }
            }
            System.out.println(total + " miles");
        }
        br.close();
    }
}