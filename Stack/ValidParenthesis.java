import java.util.Stack;

class InnerValidParenthesis {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char top = st.pop();
                    if (ch == '}' && top != '{') {
                        return false;
                    }
                    if (ch == ')' && top != '(') {
                        return false;
                    }
                    if (ch == '[' && top != ']') {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}

public class ValidParenthesis {
    public static void main(String[] args) {
        String braces = "({}}";
        InnerValidParenthesis obj = new InnerValidParenthesis();
        System.out.println(obj.isValid(braces));
    }
}
