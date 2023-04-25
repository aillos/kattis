import java.util.*;

public class filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        for (int i=0; i<input.length; i++){
            StringBuilder builder = new StringBuilder();
            builder.append(input[i].charAt(2));
            builder.append(input[i].charAt(1));
            builder.append(input[i].charAt(0));
            input[i]= builder.toString();
        }
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        if (x>y) System.out.println(x);
        if (y>x) System.out.println(y);

    }

}