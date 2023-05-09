import java.util.Scanner;

public class cocktail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPot = sc.nextInt();
        int consume = sc.nextInt();
        int maxPotion =0;
        for (int i=0;i<numPot;i++){
            int potion = sc.nextInt();
            if(potion>maxPotion){
                maxPotion=potion;
            }
        }
        if(maxPotion>consume*(numPot-1)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
