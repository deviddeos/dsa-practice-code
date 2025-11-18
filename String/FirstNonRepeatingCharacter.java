class InnerFirstNonRepeatingCharacter {

  public char firstUniqueChar() {
    String str = "racecar";
    int n = str.length();

    for (int i = 0; i < n - 1; i++) {
      boolean unique = false;
      for (int j = 0; j < n; j++) {
        if (i != j && str.charAt(i) == str.charAt(j)) {
          unique = true;
          break;
        }
      }
      if (!unique) {
        return str.charAt(i);
      }
    }
    return '$';
  }
}

public class FirstNonRepeatingCharacter {

  public static void main(String[] args) {
    InnerFirstNonRepeatingCharacter d = new InnerFirstNonRepeatingCharacter();
    System.out.println(d.firstUniqueChar());
  }
}
