import java.util.*;

public class twozerofoureight {

public static int[][] rotate(int[][] numbers) {
        int[][] rotated = new int[4][4];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                rotated[3 - j][i] = numbers[i][j];
            }
        }

        return rotated;
}
public static void move(int[] numbers) {
    boolean[] combine = new boolean[4];

    for (int i = 0; i < numbers.length; i++) {
        for (int j = i; j > 0 && !combine[j - 1]; j--) {
            if (numbers[j - 1] == 0) {
                numbers[j - 1] = numbers[j];
                numbers[j] = 0;
            } else if (numbers[j - 1] == numbers[j]) {
                numbers[j - 1] += numbers[j];
                numbers[j] = 0;
                combine[j - 1] = true;
                break;
            } else {
                break;
            }
        }
    }
}

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] numbers = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = scan.nextInt();
            }
        }
        int direction = scan.nextInt();

        for (int i = 0; i < direction; i++) {
            numbers = rotate(numbers);
        }

        for (int i = 0; i < 4; i++) {
            move(numbers[i]);
        }

        for (int i = 0; i < 4 - direction; i++) {
            numbers = rotate(numbers);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(numbers[i]).substring(1, Arrays.toString(numbers[i]).length() - 1).replace(",", ""));
        }
}
}