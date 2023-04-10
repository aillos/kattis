import java.util.*;

public class oddecho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine(); // consume the leftover newline character

        String[] s= new String[x];
        for(int i=0; i<x; i++){
            s[i]=sc.nextLine();
        }
        for (int j=0; j<x; j+=2){
            System.out.println(s[j]);
        }

        sc.close();
    }
}