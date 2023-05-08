import java.util.Scanner;

public class mia {
    public static int player(int x, int y) {
        int player;
        if (y > x) {
            int z = x;
            x = y;
            y = z;
        }
        player = Integer.parseInt(x + "" + y);
        return player;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int dice1 = sc.nextInt();
            int dice2 = sc.nextInt();
            int player1 = player(dice1, dice2);

            int dice3 = sc.nextInt();
            int dice4 = sc.nextInt();
            int player2 = player(dice3, dice4);

            if (player1 == 0 && player2 == 0) {
                break;
            }
            if (player1==player2){
                System.out.println("Tie.");
            }
            else
            {
                int win = player1 > player2 ? 1 : 2;

                if (player1 == 21 || player2 == 21) {
                    win = player1 == 21 ? 1 : 2;
                }
                else if (player1%11==0 && player2%11==0) {
                    win = player1 > player2 ? 1 : 2;
                }
                else if (player1%11==0) {
                    win = 1;
                }
                else if (player2%11==0) {
                    win = 2;
                }

                System.out.println("Player " + win + " wins.");
            }

        }
    }
}
