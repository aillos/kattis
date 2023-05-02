import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correct = sc.nextLine();
        String guesses = sc.nextLine();
        char[] chars = guesses.toCharArray();
        String output="LOSE";
        int hangman = 0;
        int x = correct.length();

        for (int i=0;i<chars.length;i++){
            if (correct.contains(""+chars[i])) {
                for (int j = 0; j < correct.length(); j++) {
                    if (chars[i]==(correct.charAt(j))) {
                        x--;
                    }
                }
            } else {
                hangman++;
            }

            if(x==0){
                output="WIN";
                break;
            } else if (hangman==10){
                break;
            }
        }

        System.out.println(output);
    }
}
