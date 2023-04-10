import java.util.*;

public class cutthenegativity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int rows = a;
        int columns = a;

        int[][] array = new int[rows][columns];
        int antall=0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                int value = s.nextInt();
                if (value == -1){
                    antall++;
                    continue;
                } else {
                    array[i][j] = value;
                }
            }
        }
        System.out.println((a*a)-antall);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (array[i][j] == 0) {
                } else {
                    System.out.print((1 + i) + " " + (j + 1) + " " + array[i][j] + "\n");
                }
            }
        }
    }
}