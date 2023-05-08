import java.util.Scanner;

public class threedprinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int statues = sc.nextInt();
        int days=1;
        int printers=1;
        for (int i=0;i<statues;i++){
            if (printers>=statues){
                break;
            }
            printers = printers*2;
            days++;
        }
        System.out.println(days);
    }
}
