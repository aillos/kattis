import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class smil {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i=0;i<input.length();i++){
            if (input.charAt(i)==':' || input.charAt(i)==';'){
                if (input.charAt(i+1)==')' || input.charAt(i+1)=='-' && input.charAt(i+2)==')'){
                    System.out.println(i);
                }
            }
        }

    }
}