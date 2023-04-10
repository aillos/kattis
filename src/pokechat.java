import java.util.*;

public class pokechat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String code = sc.nextLine();

        int len = code.length();
        int[] codeArr = new int[len / 3];

        for (int i = 0, j = 0; i < len; i += 3, j++) {
            String subStr = code.substring(i, i + 3);
            codeArr[j] = Integer.parseInt(subStr) - 1;
        }

        StringBuilder phrase = new StringBuilder();
        for (int c : codeArr) {
            phrase.append(key.charAt(c));
        }

        System.out.println(phrase);
    }

}
