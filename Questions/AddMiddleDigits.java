class InnerAddAllDigits {

  public void addDigits() {
    int num = 12345;
    int sum = 0;

    num = num / 10;
    while (num > 9) {
      int lastDigit = num % 10;
      sum += lastDigit;
      num /= 10;
    }
    System.out.println(sum);
  }
}
public class AddMiddleDigits {
  public static void main(String[] args) {
    //Add all the digits except first and last digit
    
    InnerAddAllDigits d = new InnerAddAllDigits();
    d.addDigits();
  }
}