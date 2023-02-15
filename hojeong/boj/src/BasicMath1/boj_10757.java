import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class boj_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
        BigInteger A = new BigInteger(st.nextToken()); // 엄청 큰 수일 때 사용하는 객체 BigInteger
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B); // 더하기 연산
		
		System.out.println(A.toString()); // 출력 시 문자열 변환
    }
}
