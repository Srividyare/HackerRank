import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MatrixDiagonalDifference {



        public static void main(String[] args) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int size = Integer.parseInt(br.readLine());
                int sum1 = 0, sum2 = 0;
                for (int i = 0; i<size;i++) {
                    String[] in = br.readLine().split("\\s");
                    sum1 = sum1+Integer.parseInt(in[i]);
                    sum2 = sum2+Integer.parseInt(in[(size-1) - i]);
                }
                System.out.println (Math.abs(sum1 - sum2));
            } catch (Exception e) {

            }
        }


}

