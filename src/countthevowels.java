import java.util.*;

public class countthevowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int antall=0;
        String c=a.toLowerCase();

        for (int i=0; i<a.length();i++){

            char b = c.charAt(i);
            if (b=='a' ||b=='e' ||b=='i'||b=='o'||b=='u' ){
                antall++;
            }
        }
        System.out.println(antall);
    }
}