package ConditionalStatement;

import java.util.Scanner;

public class boj_2480 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println(10000 + a*1000);
        } else if (a == b && b != c) {
            System.out.println(1000 + a*100);
        } else if (a != b && b == c) {
            System.out.println(1000 + b*100);
        } else if (a == c && b != c) {
            System.out.println(1000 + a*100);
        } else {
            int max = a;
            if(max < b) {
                max = b; 
            } 
            if(max < c) { // if 문 else 쓸 때 생각 더 하기 (항상 체크해야 하는 건지 아닌지 체크)
                max = c;
            }
            System.out.println(max*100);
        }
        sc.close();
    }
}
