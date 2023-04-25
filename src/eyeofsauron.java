import java.util.*;
import java.util.regex.Pattern;

public class eyeofsauron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] drawing = sc.nextLine().split(Pattern.quote("()"));

        if (drawing[0].equals(drawing[1])){
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }
    }

}