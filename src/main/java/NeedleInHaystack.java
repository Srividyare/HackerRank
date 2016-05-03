public class NeedleInHaystack {
  
  /**
   * Implementing strStr()
   * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
   * @param haystack
   * @param needle
   * @return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
   */
  public int strStr(String haystack, String needle) {
      int l1 = haystack.length();
      int l2 = needle.length();
      int count = 0;
      int index = 0;
     for (int i = 0; i < l1 - l2 +1; i++) {
      count = 0;
      while (count < l2 && haystack.charAt(i+count) == needle.charAt(count))
          count++;
      if (count == l2)
          return i;
  }
  return -1;
      
  }
}
