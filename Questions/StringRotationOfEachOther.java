public class StringRotationOfEachOther {
    public static boolean checkRotation() {
         String str = "abcd", str2 = "cdab";

        int n = str.length();

        if (str.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < n ; i++) {
            if (str.equals(str2)) {
                return true;
            }

            char last = str.charAt(n-1);
            str =  last + str.substring(0, n-1);
        }
        return false;
    }
    public static void main(String[] args) {
       System.out.println(checkRotation());
    }
}
