class InnerUppercaseCharInString {

    public int uppercaseChar() {
        String[] str = { "India is HJa Great Country"};
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (ch >= 'A' && ch <= 'Z') {
                    count++;
                }
            }
        }
        return count;
    }
}
public class UppercaseCharInString {

    public static void main(String[] args) {
        InnerUppercaseCharInString d = new InnerUppercaseCharInString();
        System.out.println("Total number of Uppercase: "+ d.uppercaseChar());
    }
}
