import java.util.Scanner;

public class boj_1065 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;
        int flag = 1;
        for (int i=1; i<=N; i++) {
            int num = i;
            if (num/10 == 0 || num/100 == 0) {
                cnt++;
            } else {
                // 세자리부터 유의미한 연산
                while (num/100 != 0) {
                    int d1 = num%10 - num/10%10;
                    num /= 10;
                    int d2 = num%10 - num/10%10;
                    if (d1 != d2) {
                        flag = 0;
                        break;
                    } else {
                        flag = 1; // flag 필요한 위치 전부 신경써야함 (flag가 0이 된 후 1로 변경 필요)
                    }
                }
                if (flag == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
