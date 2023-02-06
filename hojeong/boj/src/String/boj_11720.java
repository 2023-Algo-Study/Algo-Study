import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        String array[] = s.split(""); // br로 입력받은 string을 한 글자씩 끊어서 배열에 넣음.
        int sum = 0;
        for (int i=0; i<N; i++) { // 배열 인덱스 = N . 만큼 하나씩 int형으로 변환해서 더해줌.
            sum += Integer.parseInt(array[i]);
        }
        System.out.println(sum);
    }
}
