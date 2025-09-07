import java.util.Stack;

class InnerCheckPalindrome {
    public boolean isPalindrome(String str) {
        Stack<Character> st = new Stack<>();
        int length = str.length();
        int halfLength = length/2;

        for (int i = 0; i < halfLength; i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }

        int start = (length % 2== 0) ? halfLength : halfLength +1;

        for (int i = start; i < length; i++) {
            char ch = str.charAt(i);
            if (st.isEmpty() || ch != st.pop()) {
                return false;
            }
        }
        return st.isEmpty();
    }
}
public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "racecar";
        InnerCheckPalindrome obj = new InnerCheckPalindrome();
        boolean result = obj.isPalindrome(str);
        System.out.println(result);
    }
}
