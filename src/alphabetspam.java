import java.util.*;

public class alphabetspam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        float whitespace = 0;
        float lowercase = 0;
        float uppercase = 0;
        float symbols = 0;

        for (int i=0; i<input.length();i++) {
            int charType = Character.getType(input.charAt(i));

            if (charType==Character.LOWERCASE_LETTER){
                lowercase++;
            } else if (charType==Character.UPPERCASE_LETTER){
                uppercase++;
            } else if (input.charAt(i)=='_'){
                whitespace++;
            } else {
                symbols++;
            }
        }
        System.out.println(whitespace/input.length());
        System.out.println(lowercase/input.length());
        System.out.println(uppercase/input.length());
        System.out.println(symbols/input.length());
    }
}