import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stickykeys {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder result = new StringBuilder();

        for (int i=0; i<input.length();i++){
            if (i==0 || input.charAt(i)!=input.charAt(i-1)){
                result.append(input.charAt(i));
            }
        }

        System.out.println(result);

    }
}