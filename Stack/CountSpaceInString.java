import java.util.Stack;

class InnerCountSpaceInString {
    public int countSpace(String str) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }
        
        while (!st.isEmpty()) {
            char top = st.pop();
            if (top == ' ') {
                count++;
            }
        }
        return count;
    }
    
}
public class CountSpaceInString {
    public static void main(String[] args) {
        String str = "India is a great country.";
        InnerCountSpaceInString obj = new InnerCountSpaceInString();
        int totalSpaces = obj.countSpace(str);
        System.out.println(totalSpaces);
    }
}
