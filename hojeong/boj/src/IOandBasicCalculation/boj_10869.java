import java.util.Scanner;

public class boj_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // double A = sc.nextDouble();
        // double B = sc.nextDouble();
        // System.out.println((int)(A + B));
        // System.out.println((int)(A - B));
        // System.out.println((int)(A * B));
        // System.out.println((int)(A / B));
        // System.out.println((int)(A % B));

        // 자연수 입력받아서 사칙연산 값 출력하기
        // int형으로 출력되어야 하는 이유? 문제에 몫, 나머지를 출력하라고 되어 있기 때문이다. 
        // (1008은 몫이라 명시 x 단지 나누기 연산 결과 값이고 예제에 실수형으로 출력됨)
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((A + B));
        System.out.println((A - B));
        System.out.println((A * B));
        System.out.println((A / B));
        System.out.println((A % B));

        sc.close();
    }
}
