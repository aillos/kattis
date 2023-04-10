import java.util.*;

public class greetings2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String section = x.substring(1, x.length() - 1);
        String result = "";

        for (int i = 0; i < section.length()*2; i++){
            result += "e";
        }
        System.out.println("H" + result + "y");
    }
}