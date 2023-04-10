import java.util.*;

public class timeloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X= sc.nextInt();
        String spell = "Abracadabra";

        for (int i=1; i<=X; i++){
            System.out.println(i+" "+spell);
        }

    }
}
