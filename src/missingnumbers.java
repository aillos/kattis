import java.util.*;

public class missingnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int interval = sc.nextInt();
        int highest = 0;

        Set<Integer> numbers=new HashSet<>();
        for (int i=0;i<interval;i++){
            highest=sc.nextInt();
            numbers.add(highest);
        }

        if(highest==interval){
            System.out.println("good job");
            return;
        }

        Set<Integer> missing=new HashSet<>();
        for (int i=1;i<=highest;i++){
            if (!numbers.contains(i)){
                missing.add(i);
            }
        }

        Iterator itr = missing.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
