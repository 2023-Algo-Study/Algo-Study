import java.util.Scanner;

public class boj_2884 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 45) {
            if (H == 0) {
                H = 23;
            } else {
                H--;
            }
            M = M + 60 - 45;
        } else if (M >= 45) {
            M -= 45;
        }
        System.out.println(H + " " + M);

        sc.close();
    }
}
