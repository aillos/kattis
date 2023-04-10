import java.util.*;

public class magictrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        String letters = sc.nextLine();
        int count = 0;
        for (char c : letters.toCharArray()) {

            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
                count=counter;
            } else {
                map.put(c, 1);
            }

        }
        if (count>1){
            System.out.println("0");
        } else {
            System.out.println("1");
        }

    }
}