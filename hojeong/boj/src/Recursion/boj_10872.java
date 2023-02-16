import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10872 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long total = fac((long)N);
        System.out.println(total);
    }

    public static long fac(long N) {
        if (N == 0 || N == 1) {
            return 1;
        } else {
            return N * fac(N-1);
        }
    }
}