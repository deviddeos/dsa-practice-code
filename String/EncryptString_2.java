class InnerEncryptString_2 {

  public String encryptString(String str) {
    StringBuilder encrypt = new StringBuilder();
    int n = str.length();

    for (int i = 0; i < n; i++) {
      int count = 0;
      char ch = str.charAt(i);

      while (i < n && str.charAt(i) == ch) {
        count++;
        i++;
      }
      i--;

      String hex = decToHex(count);

      encrypt.append(ch);
      encrypt.append(hex);
    }
    return encrypt.reverse().toString();
  }

  public String decToHex(int num) {
    StringBuilder temp = new StringBuilder();

    while (num != 0) {
      int rem = num % 16;
      if (rem < 10) {
        temp.append((char)(rem + '0'));
      } else {
        temp.append((char)(rem - 10 + 'a'));
      }

      num /= 16;
    }
    return temp.reverse().toString();
  }
}

public class EncryptString_2 {
  public static void main(String[] args) {
    String str = "abc";
    InnerEncryptString_2 obj = new InnerEncryptString_2();
    System.out.println(obj.encryptString(str));
  }
}
