import java.util.*;

public class avion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = new String[5];
        List<Integer> rows = new ArrayList<>();
        for (int i=0; i< input.length;i++){
            input[i]=sc.nextLine();
            if (input[i].contains("FBI")){
                rows.add(i+1);
            }
        }
        if (rows.isEmpty()){
            System.out.println("HE GOT AWAY!");
        } else {
            System.out.println(rows.toString().replace("[", "").replace("]", "").replace(",",""));
        }
    }
}