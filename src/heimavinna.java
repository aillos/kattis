import java.util.*;

public class heimavinna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(";");
        Set<Integer> problems = new HashSet<>();
        for (int i=0;i<input.length;i++){
            if (input[i].contains("-")){
                int x = Integer.parseInt(input[i].substring(0,input[i].indexOf("-")));
                int y = Integer.parseInt(input[i].substring(input[i].indexOf("-")+1));
                for (int j=x; j<=y;j++){
                    problems.add(j);
                }
            } else {
                problems.add(Integer.parseInt(input[i]));
            }
        }
        System.out.println(problems.size());
    }
}