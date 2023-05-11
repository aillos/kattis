import java.util.*;

public class titlecost{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String title = sc.next();
        double cap = sc.nextDouble();

        if(title.length()>cap){
            System.out.println(cap);
        } else {
            System.out.println(title.length());
        }
    }
}