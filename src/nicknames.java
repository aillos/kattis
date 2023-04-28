import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class nicknames {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numNames = Integer.parseInt(br.readLine());
        String [] names = new String[numNames];
        for (int i = 0; i < numNames; i++) {
            names[i] = br.readLine();
        }
        int numNicks = Integer.parseInt(br.readLine());
        String [] nicknames = new String[numNicks];
        for (int i = 0; i < numNicks; i++) {
            nicknames[i] = br.readLine();
        }
        Arrays.sort(names);
        for (int i=0; i<numNicks;i++){
            String test = nicknames[i];
            int count=0;
            for (int j = 0; j<numNames;j++){
                String sub = names[j].substring(0,test.length());
                if (sub.equals(test)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}