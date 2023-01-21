package Loop;

import java.util.Scanner;

public class boj_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) { // 1 말고 true로 적어야함.
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            }

            System.out.println(A+B);
        }
        sc.close();
    }
}
