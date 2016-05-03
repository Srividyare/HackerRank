package pubnubmon;

import java.util.ArrayList;
import java.util.List;

public class CountPalindromes {
  /**
   * Given a String s, counts the number of palindroms in contains
   * Example: madam - 7 (m, a, d, a, m, ada, madam)
   * Also prints the list of palindromes
   * @param s
   * @return
   */
  static int count_palindromes(String s) {
      List<String> res = new ArrayList<>();
      for (int i = 0; i < s.length(); i++) {
          StringBuilder sb = new StringBuilder();
          int j = i, k = i + 1;
          res.add(s.charAt(i) + "");
          // the min palindrome can be on lenght 3 (not considering the character itself)
          // so get the sub string of length 3 by moving the pointers j and k to either side
          
          for (int it = 0; it < 2; it++) {
              if (it == 1) {
                  j = i - 1;
                  k = i + 1;
                  sb.setLength(0);
                  sb.append(s.charAt(i));
              }
              
              // Now since we have j and k at either ends of thesub string of length 3, we can see
              // if it is a palindrome or not. Break the loop if it is not.
              while (j >= 0 && k < s.length()) {
                  if (s.charAt(j) == s.charAt(k)) {
                      sb.insert(0, s.charAt(j));
                      res.add(sb.append(s.charAt(k)).toString());
                      j--;
                      k++;
                  } else
                      break;
              }
      }
      }
      System.out.println(res);
      return res.size();
  }
  
  public static void main(String[] args) {
    System.out.println(count_palindromes("madam"));
  }
  
  
}

