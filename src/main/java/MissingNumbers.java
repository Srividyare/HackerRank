import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MissingNumbers {

  /**
  Numeros, the Artist, had two lists AA and BB, such that BB was a permutation of AA. 
  Numeros was very proud of these lists. Unfortunately, while transporting them from one exhibition to another, 
  some numbers were left out of AA. Can you find the missing numbers?
  Input: 
  10
  203 204 205 206 207 208 203 204 205 206
  13
  203 204 204 205 206 207 205 208 203 206 205 206 204
  Output: 
  204 205 206

  Idea to solve this is to take a array and initialize it a high value. Iterate over each array and add +1 for each unique element
  in the first array and -1 for each unique element in the second array. The final array should have 0 in the index if the no elements are
  missing.
  */

    public static void main(String[] args) {
        List<Integer> answer = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int l1 = Integer.parseInt(s.nextLine());
        String[] input1 = s.nextLine().split("\\s");

        int l2 = Integer.parseInt(s.nextLine());
        String[] input2 = s.nextLine().split("\\s");


        int[] yo = new int[10000101]; // Initializing the array to a high size, as per the requrements
        Arrays.fill(yo, 100000000); // Set the value of the array, something eithr too high or too low
        for (int i = 0; i < l1; i++){ // Iterate over first input array
            if (yo[Integer.parseInt(input1[i])] == 100000000) {
                yo[Integer.parseInt(input1[i])] = 0;
            }
            yo[Integer.parseInt(input1[i])] = yo[Integer.parseInt(input1[i])] + 1; // Add +1
        }

        for (int i = 0; i < l2; i++){ // Iterate over second input array
            if (yo[Integer.parseInt(input2[i])] == 100000000) {
                yo[Integer.parseInt(input2[i])] = 0;
            }
            yo[Integer.parseInt(input2[i])] = yo[Integer.parseInt(input2[i])] - 1; // Add -1
        }

        for (int i = 0; i< yo.length; i++) {
            if (yo[i] != 0 && yo[i] != 100000000) {
                answer.add(i);
            }
        }
        for (int i = 0; i < answer.size(); i++){
        System.out.print(answer.get(i) + " ");
        }

    }
  }
