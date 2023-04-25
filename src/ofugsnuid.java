import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ofugsnuid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(br.readLine());
        int[] numbers = new int[lines];
        for (int i=0; i<lines; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        for (int i = lines - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}