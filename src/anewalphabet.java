import java.util.*;

public class anewalphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String [] newAlphabet = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/","}{", "`/", "2"};

        String originalString = sc.nextLine().toLowerCase();

        StringBuilder convertedString = new StringBuilder();
        for (int i = 0; i < originalString.length(); i++) {
            char c = originalString.charAt(i);
            int index = originalAlphabet.indexOf(c);
            if (index != -1) {
                convertedString.append(newAlphabet[index]);
            } else {
                convertedString.append(c);
            }
        }

        System.out.println(convertedString);
    }
}
