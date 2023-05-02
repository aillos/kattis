import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class onedfroggereasy {
    public static void main(String[] args) {
        String [] fates = {"magic", "left", "right", "cycle"};

        Scanner sc = new Scanner(System.in);
        int boardSquares = sc.nextInt();
        int currentSquare = sc.nextInt();
        int magicNum = sc.nextInt();

        int [] board = new int[boardSquares];
        for (int i=0;i<boardSquares;i++){
            board[i]=sc.nextInt();
        }
        String fate;
        Set<Integer> visited = new HashSet<>();
        int jumps = 0;
        while (true){
            if (visited.contains(currentSquare)){
                fate=fates[3];
                break;
            } else if (currentSquare<1){
                fate=fates[1];
                break;
            } else if (currentSquare>boardSquares){
                fate=fates[2];
                break;
            } else if (board[currentSquare-1] == magicNum) {
                fate=fates[0];
                break;
            } else {
                visited.add(currentSquare);
                currentSquare+=board[currentSquare-1];
                jumps++;
            }
        }
        System.out.println(fate);
        System.out.println(jumps);
    }
}
