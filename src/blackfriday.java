import java.util.*;

public class blackfriday {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int participants = sc.nextInt();
        int [] diceRolls = new int[participants];
        for (int i=0;i<participants;i++){
            diceRolls[i]=sc.nextInt();
        }

        int numWin = 0;
        int indexWin = -1;
        for (int i=0;i<participants;i++){
            int x = 0;
            int indeX = -1;
            if (diceRolls[i]<numWin){
                x = numWin;
                indeX = indexWin;
                indexWin=i;
                numWin=diceRolls[i];
            } else if (diceRolls[i]==indexWin){
                indexWin=indeX;
                numWin=x;
            }
            System.out.println(indexWin);
        }
    }
}