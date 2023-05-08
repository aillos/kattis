import java.util.*;

public class fodelsedagsmemorisering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> points = new HashMap<>();
        Map<String, String> names = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int point = Integer.parseInt(input[1]);
            String date = input[2];

            if (points.containsKey(date)) {
                if (points.get(date) < point) {
                    points.put(date, point);
                    names.put(date, name);
                }
            } else {
                points.put(date, point);
                names.put(date, name);
            }
        }

        List<String> chosenNames = new ArrayList<>(names.values());
        Collections.sort(chosenNames);
        System.out.println(chosenNames.size());
        for (String name : chosenNames) {
            System.out.println(name);
        }
    }
}
