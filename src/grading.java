import java.util.*;

public class grading{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        int E=sc.nextInt();

        int current=sc.nextInt();
        String grade = "A";

        if (current < E) {
            grade = "F";
        } else if (current < D) {
            grade = "E";
        } else if (current < C) {
            grade = "D";
        } else if (current < B) {
            grade = "C";
        } else if (current < A) {
            grade = "B";
        }

        System.out.println(grade);
    }
}
