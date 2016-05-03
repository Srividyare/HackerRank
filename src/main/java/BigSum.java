import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BigSum {

  

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            input = br.readLine();
            String[] s = input.split("\\s");
            long out = 0;
            for (int i = 0; i<s.length;i++) {
                out = out + Integer.parseInt(s[i]);
            }
            System.out.println(out);
        } catch (Exception e) {

        }
    }
}

