import java.util.Scanner;

public class boj_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 * (num2 % 10)); // 1의 자리 곱하기
        System.out.println(num1 * (num2 /10 % 10)); // 10의 자리 곱하기
        System.out.println(num1 * (num2 /100 % 10)); // 100의 자리 곱하기 
        System.out.println(num1 * num2);

        sc.close();
    }
}
