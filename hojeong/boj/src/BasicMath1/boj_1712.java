import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] s = str.split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        
        if (C <= B) { // 조건 중요
            System.out.println("-1");
        } else {
            System.out.println((A/(C-B)+1)); // 조건 중요
        }
    }
}
