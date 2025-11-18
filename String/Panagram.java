public class Panagram {
    public static boolean isPanagram(String s) {
        s = s.toLowerCase();

        for (char i = 'a'; i <= 'z'; i++) {
            boolean found = false;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(s));
    }
}
