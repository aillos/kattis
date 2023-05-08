import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correct = sc.nextInt();
        sc.nextLine();
        String you = sc.nextLine();
        String friend = sc.nextLine();

        int sameAnswer=0;
        int possibleCorrect;
        int test=you.length();

        for(int i=0;i<test;i++){
            if (you.charAt(i)==friend.charAt(i)){
                sameAnswer++;
            }
        }

        if (sameAnswer==0){
            possibleCorrect=test-correct;
        } else if (sameAnswer==correct){
            possibleCorrect=test;
        } else if (sameAnswer>correct){
            possibleCorrect=test-(sameAnswer-correct);
        } else {
            possibleCorrect=test-(correct-sameAnswer);
        }

        System.out.println(possibleCorrect);
    }
}
