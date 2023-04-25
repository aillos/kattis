import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pyramids {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int total=0;
        int x = 1;
        int levels = 0;
        while (total<input){
            total=total+x*x;
            if (total>input) break;
            x+=2;
            levels++;
        }
        System.out.println(levels);

    }
}