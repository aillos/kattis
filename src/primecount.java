import java.util.*;

public class primecount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int interval = sc.nextInt();

        BitSet sieve = new BitSet(interval);
        sieve.set(1, interval, true);
        int numPrimes = interval - 1;

        for (int i = 2; i <= (int) Math.ceil(Math.sqrt(interval)); i++) {

            if (sieve.get(i - 1)) {
                for (int j = i * i; j <= interval; j += i) {
                    if (sieve.get(j - 1)) {
                        numPrimes--;
                    }
                    sieve.set(j - 1, false);
                }
            }
        }

        System.out.println(numPrimes);
    }
}
