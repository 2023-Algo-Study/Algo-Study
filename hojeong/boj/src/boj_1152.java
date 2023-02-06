import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        if (s.equals(" ")) {
            System.out.println(0);
        } else {
            String[] arr = s.split(" ");

            if (arr[0] == "") {
                System.out.println(arr.length - 1);
            } else {
                System.out.println(arr.length);
            }
        }
    }
}
