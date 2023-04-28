import java.util.*;

public class alphabetanimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String played = sc.next();
        int animalNum = sc.nextInt();
        String[] animals = new String[animalNum];
        for (int i = 0; i < animalNum; i++) {
            animals[i] = sc.next();
        }

        char last = played.charAt(played.length() - 1);
        int[] count = new int['z' + 1];
        List<String> usableAnimals = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {
            String a = animals[i];
            count[a.charAt(0)]++;
            if (a.charAt(0) == last) {
                usableAnimals.add(a);
            }
        }
        if (usableAnimals.isEmpty()) {
            System.out.print('?');
            return;
        }
        for (int i = 0; i < usableAnimals.size(); i++) {
            String a = usableAnimals.get(i);
            if (count[a.charAt(a.length() - 1)] == 0 ||
                    a.charAt(0) == a.charAt(a.length() - 1) && count[a.charAt(0)] == 1) {
                System.out.print(a + '!');
                return;
            }
        }
        System.out.print(usableAnimals.get(0));
    }
}
