import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class divisible {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numTestCases = Integer.parseInt(reader.readLine());

        while (numTestCases-- > 0) {
            Map<Integer, Integer> counts = new HashMap<>();
            String[] input = reader.readLine().split(" ");

            int divider = Integer.parseInt(input[0]);
            int numbers = Integer.parseInt(input[1]);
            int[] remainder = new int[numbers];

            input = reader.readLine().split(" ");
            for (int i = 0; i < numbers; i++) {
                int number = Integer.parseInt(input[i]);
                if (i != 0) {
                    remainder[i] = (number + remainder[i - 1]) % divider;
                } else {
                    remainder[i] = number % divider;
                }
                int value;
                if (remainder[i] == 0) {
                    value = 1;
                } else {
                    value = 0;
                }
                counts.put(remainder[i], value);
            }

            int sequences = 0;
            for (int i = 0; i < numbers; i++) {
                sequences += counts.get(remainder[i]);
                counts.put(remainder[i], counts.get(remainder[i]) + 1);
            }
            System.out.println(sequences);
        }
    }

}