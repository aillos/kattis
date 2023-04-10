import java.util.Scanner;

public class echoechoecho{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String word = s.next();

        for (int i = 0; i<3; i++){
            System.out.println(word + "");
        }
    }
}