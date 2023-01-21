package Loop;

import java.util.Scanner;

public class boj_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 더하기 사이클 
        int N = sc.nextInt();
        int input = N;
        int cnt = 0;
        
        while(true) {
            cnt++;
            int sum = N/10 + N%10; // 십의 자리 + 일의 자리
            int num = N%10*10 + sum%10; // 일의 자리 * 10 + 일의 자리
            N = num;
            if(num == input) {
                System.out.println(cnt);
                break;
            }
        }
        sc.close();
        // 예시 다 읽고 공통점 확실히 파악 후 코드 작성하기
    }
}
