import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class transitwoes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] info = br.readLine().split(" ");
        String [] walking = br.readLine().split(" ");
        String [] bustime = br.readLine().split(" ");
        String [] waiting = br.readLine().split(" ");
        int total=0;
        for (int i =0;i< walking.length;i++){
            total+=Integer.parseInt(walking[i]);
        }
        for (int i=0;i<Integer.parseInt(info[2]);i++){
            int x;
            int y=Integer.parseInt(bustime[i]);
            int z=Integer.parseInt(waiting[i]);
            if (y>z){
                x=z*2-y;
                total = total + y + x;
            } else if (y<z){
                x=z-y;
                total = total + x;
            } else {
                total = total + y;
            }
        }
        if(total<Integer.parseInt(info[1])){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

