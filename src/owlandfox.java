import java.util.Scanner;

public class owlandfox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=0;i<num;i++){
            int z=1;
            int x = sc.nextInt();
            String xString = String.valueOf(x);
            int xDigits = xString.length();
            for (int j=xDigits-1;j>=0;j--){
                int y = Character.getNumericValue(xString.charAt(j));
                if (y>0){
                    break;
                }
                z*=10;
            }
            System.out.println(x-z);
        }
    }
}

