import java.util.Scanner;

public class finalexam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();

        String [] answers = new String[lines];
        String x = "F";
        int correct = 0;

        for (int i=0;i<lines;i++){
            answers[i]=sc.next();
            if (answers[i].equals(x)){
                correct++;
            }
            x=answers[i];
        }
        System.out.println(correct);
    }
}
