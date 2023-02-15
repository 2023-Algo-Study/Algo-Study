import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2839 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (total > 0) {
            if (total % 5 == 0) {
                cnt += total/5;
                total = 0;
            } else {
                if (total >= 3) {
                    total -= 3;
                    cnt++;
                } else {
                    cnt = -1;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
