import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1193 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int a = 1;
        int b = 1;

        int  i = 1;
        int sum = 1;
        // int cnt = 1;
        while (X > sum) {
            i += 1;
            int j = 1;
            if (X <= sum+i) {
                if (i % 2 == 1) {
                    a = i;
                    b = 1;
                    while (j <= i && sum+j < X) { // 두 번째 조건 주의. sum + j 가 X-1 일 때 출력할 a,b 완성됨. 
                        a--;
                        b++;
                        j++;
                    }
                } else if (i % 2 == 0) {
                    a = 1;
                    b = i;
                    while (j <= i  && sum+j < X) {
                        a++;
                        b--;
                        j++;
                    }
                }
            }
            sum += i;
            // cnt++;

        }
        System.out.println(a + "/" + b);

    }
}
