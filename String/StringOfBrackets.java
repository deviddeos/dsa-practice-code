class InnerStringOfBrackets {
    public int equalBrackets(String s) {
        int braces = 0;
        for (int i = 0; i < s.length()-1; i++) {
            char ch = s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                if (ch == '(' && s.charAt(j) == ')') {
                    braces += 2;
                    break;
                }
            }
        }
        if (braces > 0) {
            return braces;
        }
        return -1;
    }
}
public class StringOfBrackets {
    public static void main(String[] args) {
        String str = "(())))()";
        InnerStringOfBrackets d = new InnerStringOfBrackets();
        System.out.println(d.equalBrackets(str));
    }
}