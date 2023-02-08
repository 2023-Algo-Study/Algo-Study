import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] str = s.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        // 숫자 뒤집기
        int num1 = 0;
        int num2 = 0;
        // 문제에 세자리수라고 명시되어 있음.
        num1 += a%10*100; // +400 // %는 무조건 10이다. 
        a /= 10; // 73
        num1 += a%10*10; // +30
        a /= 10; // 7
        num1 += a;

        num2 += b%10*100;
        b /= 10; 
        num2 += b%10*10; 
        b /= 10; 
        num2 += b;

        // 큰 값 출력
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

    }
}
