import java.util.Scanner;

public class ants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i=0;i<cases;i++){
            int pole = sc.nextInt();
            int numAnts = sc.nextInt();
            int earliest=0;
            int latest=0;
            for (int j=0;j<numAnts;j++){
                int ant=sc.nextInt();
                int shortWay, longWay;
                if (ant>pole/2){
                    shortWay=pole-ant;
                    longWay=ant;
                } else {
                    shortWay=ant;
                    longWay=pole-ant;
                }
                if (shortWay>earliest){
                    earliest=shortWay;
                }
                if (longWay>latest){
                    latest=longWay;
                }
            }
            System.out.println(earliest + " " + latest);
        }
    }
}
