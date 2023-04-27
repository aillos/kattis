import java.util.*;

public class alphabetanimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String played = sc.next();
        int animalNum = sc.nextInt();
        String[] animals = new String[animalNum];
        for (int x = 0; x < animalNum; x++) {
            animals[x] = sc.next();
        }

        char last = played.charAt(played.length() - 1);
        int[] count = new int['z' + 1];
        List<String> usableAnimals = new ArrayList<>();
        for (String a : animals) {
            count[a.charAt(0)]++;
            if (a.charAt(0) == last) {
                usableAnimals.add(a);
            }
        }
        if (usableAnimals.isEmpty()) {
            System.out.print('?');
            return;
        }
        for (String a : usableAnimals) {
            if (count[a.charAt(a.length() - 1)] == 0 ||
                    a.charAt(0) == a.charAt(a.length() - 1) && count[a.charAt(0)] == 1) {
                System.out.print(a + '!');
                return;
            }
        }
        System.out.print(usableAnimals.get(0));
    }
}
