import java.util.ArrayList;
import java.util.Scanner;

public class detaileddifferences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numInput = sc.nextInt();
        String [] input = new String[numInput*2];
        ArrayList<String> result = new ArrayList<String>();
        int x=0;

        for (int i=0; i<input.length; i++){
            input[i]=sc.next();
        }
        for (int i=0; i<numInput;i++){
            result.add(input[x]);
            result.add(input[x+1]);
            StringBuilder diff = new StringBuilder();
            for (int j=0; j<input[x].length();j++){
                if (input[x].charAt(j)==input[x+1].charAt(j)){
                    diff.append(".");
                } else {
                    diff.append("*");
                }
            }
            x+=2;
            result.add(diff.toString());
            result.add("");
            diff.setLength(0);
        }
        for (int i=0; i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}