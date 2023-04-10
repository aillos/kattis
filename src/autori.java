import java.util.*;

public class autori{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] word = sc.nextLine().split("-");
        String output = "";
        for (String t : word){
            output += t.charAt(0);
        }
        System.out.println(output);

    }
}