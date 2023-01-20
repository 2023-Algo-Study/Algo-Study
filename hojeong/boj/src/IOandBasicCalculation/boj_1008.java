import java.util.Scanner;

public class boj_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수형이 아니라 실수형(소수점까지 출력 잘 되려면) double형으로 입력받아야 한다.
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        System.out.println(A / B);

        sc.close();
    }
}