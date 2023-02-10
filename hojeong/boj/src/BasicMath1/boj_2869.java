import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] s = str.split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int V = Integer.parseInt(s[2]);

        if ((V-A)%(A-B) == 0) {
            System.out.println((V-A)/(A-B) + 1);
        } else if ((V-A)%(A-B) != 0) {
            System.out.println((V-A)/(A-B) + 2);
        }
    }
}