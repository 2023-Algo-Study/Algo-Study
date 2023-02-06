import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c = br.readLine().charAt(0);
        int num = c; // int로 형변환 되면서 약간의 데이터 낭비가 일어남. // byte 형변환 연산자를 사용해서 byte 변수로 받아도 됨.

        System.out.println(num);
    }
}
