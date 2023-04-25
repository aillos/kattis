import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class skruop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = 7;
        int lines = Integer.parseInt(br.readLine());
        for (int i=0;i<lines;i++){
            String input = br.readLine();
            if (input.equals("Skru op!") && start<10){
                start++;
            } else if (input.equals("Skru ned!") && start>0){
                start--;
            }
        }
        System.out.println(start);

    }
}