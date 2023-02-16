import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_25501 {
    private static int cnt = 0;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            cnt = 0;
            String s = br.readLine();
            System.out.println(isPalindrome(s) + " " + cnt);
        }

    }

    // palindrome 함수, recursion 함수 기억하기
    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
