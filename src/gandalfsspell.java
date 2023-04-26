import java.util.*;

public class gandalfsspell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        String[] words = sc.nextLine().split(" ");
        boolean ok = code.length() == words.length;
        if (ok) {
            Map<String, Character> map1 = new HashMap<>();
            Map<Character, String> map2 = new HashMap<>();
            for (int i = 0; i < code.length(); i++) {
                char pattern = code.charAt(i);
                String spell = words[i];
                if (!map1.containsKey(spell) && !map2.containsKey(pattern)) {
                    map1.put(spell, pattern);
                    map2.put(pattern, spell);
                } else if (map1.containsKey(spell) && map2.containsKey(pattern) && map1.get(spell) == pattern && map2.get(pattern).equals(spell)) {
                    continue;
                } else {
                    ok = false;
                    break;
                }
            }
        }
        System.out.println(ok);
        sc.close();
    }
}
