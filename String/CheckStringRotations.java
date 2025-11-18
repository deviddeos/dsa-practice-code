class InnerCheckStringRotations {

    public boolean rotateString() {
        String s1 = "abcd";
        String s2 = "cdab";
        
        int n = s1.length();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.equals(s2)) {
                return true;
            }

            char last = s1.charAt(n-1);
            s1 = last + s1.substring(0, n-1);
        }
        return false;
    }
}

public class CheckStringRotations {
    public static void main(String[] args) {
        InnerCheckStringRotations d = new InnerCheckStringRotations();
        System.out.println(d.rotateString());
    }
}
