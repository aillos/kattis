import java.util.*;

public class findingana {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String z = "";
        char y = 'a';

        for (int i=0; i<x.length();i++){
            if (x.charAt(i) == y){
                z=x.substring(i);
                break;
            }
        } System.out.println(z);
    }
}