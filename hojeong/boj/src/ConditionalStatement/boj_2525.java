import java.util.Scanner;

public class boj_2525 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int time = sc.nextInt();

        if (B + time >= 60) {
            A += (B + time) / 60;
            B = (B + time) % 60;
            if (A >= 24) {
                A -= 24;
            }
        } else {
            B += time;
        }

        System.out.println(A + " " + B);

        sc.close();
    }
}
