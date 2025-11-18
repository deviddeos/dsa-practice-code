public class Pattern1 {

  public static void numToPattern(int num) {
    String s = Integer.toString(num);
    char[] ch = s.toCharArray();
    int max = 0;
    for (char c : ch) {
        max = Math.max(max, c - '0');
    }
    for (int row = max - 1; row >= 0; row--) {
      for (int j = 0; j < ch.length; j++) {
        if (ch[j] - '0' > row) {
            System.out.print("*"); 
        } else {
            System.out.print(" ");
        }
        if (j < ch.length - 1) {
            System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    numToPattern(573);
  }
}
