import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10870 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n==0) {
            System.out.println(0);
        } else {
            System.out.println(fibo(n));
        }

    }

    private static int fibo(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return (fibo(n-1) + fibo(n-2));
        }
    }
}
