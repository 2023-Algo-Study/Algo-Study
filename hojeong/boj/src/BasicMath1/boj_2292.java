import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2292 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 1. 
        // int cnt = 0;
        // int flag = 0;
        // if(N == 1) {
        //     System.out.println("1");
        // } else {
        //     while (true) {
        //         int i=0;
        //         cnt++;
        //         flag += cnt;
    
        //         i = flag*6+1;
        //         if (N <= i) {
        //             break;
        //         }
        //     }
        //     System.out.println(cnt+1);
        // }
        // 난 되게 어렵게 생각했었던 것임. 
        // 사실 1,7,19,37,61 자체가 계차수열인데, 이 값의 몫을 보고 계차수열이라고 하고 식을 세우려 해서 더 복잡했던 것.
        // 이 사실을 알고 나니 되게 간단하게 느껴짐. 오히려 다행 .. 

        // 2. 민콩이 거 보고 
        int i = 0;
        int sum = 1;
        int cnt = 1;
        while (N > sum) { // 1일 때 값 처리 주의, 사실 상 cnt가 2가 될 때 부터 연산.
            i += 6; // 공차가 등차수열
            sum += i; // 계차수열
            cnt++;
        }
        System.out.println(cnt);
    }
}
