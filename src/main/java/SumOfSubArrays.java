import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumOfSubArrays {


    /**
     * Retun the max sum of sub arrays that are contingent and also the max sum of subarrays that are non-contingent
     * Example: [1,2,3,4,5] - 15 15
     * [2, -1, 2, 3, 4, -5] - 10 11
     * @param numbers
     */
    public void sum(int[] numbers) {
        int MaxContigSum=numbers[0];
        int MaxNonContigSum=numbers[0];
        int prevSum=0;
        for(int i=0;i<numbers.length;i++){
            prevSum=Math.max(numbers[i],prevSum+numbers[i]);
            MaxContigSum=Math.max(MaxContigSum,prevSum);
            if(MaxNonContigSum>0 && i!=0)
                MaxNonContigSum=Math.max(MaxNonContigSum,MaxNonContigSum+ numbers[i]);
            else
                MaxNonContigSum= Math.max(MaxNonContigSum,numbers[i]);
        }
        System.out.println(MaxContigSum + " " + MaxNonContigSum);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int testCases = Integer.parseInt(s.nextLine());

        for (int i = 0; i < testCases; i ++) {
            String secondLine = s.nextLine();
            int length = Integer.parseInt(secondLine);

            String[] thirdLine = s.nextLine().trim().split("\\s");
            int[] input = new int[length];
            for (int j = 0; j < length; j++) {
                input[j] = Integer.parseInt(thirdLine[j]);
            }
            SumOfSubArrays sol = new SumOfSubArrays();
            sol.sum(input);
        }
    }
}
