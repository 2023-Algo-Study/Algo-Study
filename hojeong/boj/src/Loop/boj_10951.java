package Loop;

import java.util.Scanner;

public class boj_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문제에 입력의 끝이 명시되어 있지 않음. 
        while(sc.hasNextInt()) { // 윈도우 ctrl + Z 누르면 끝남
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
        sc.close();
    }
}
