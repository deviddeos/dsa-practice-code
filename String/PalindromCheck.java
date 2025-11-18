public class PalindromCheck {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        if (s.length() == 0) {
            return false;
        }
        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) 
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "";
        if (isPalindrome(str)) {
            System.out.println("String is Palindrome");
        }else {
            System.out.println("Not a palindrome..");
        }
    }
}
