import java.util.*;

public class apaxiaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i=0;i<input.length();i++){
            if (i!=0 && input.charAt(i)==input.charAt(i-1)){
                continue;
            } else {
                result.append(input.charAt(i));
            }
        }
        System.out.println(result);
    }
}