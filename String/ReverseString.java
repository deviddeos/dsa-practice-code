public class ReverseString {
    public static void reverseString() {
        String s = "India";
        String str2 = "";
        // for (int i = str.length()-1; i >= 0; i--) {
        //     str2 = str2 + str.charAt(i);
        // }

        // System.out.println(str2);

        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }

        System.out.println(rev.toString());
    }
    public static void main(String[] args) {
        reverseString();
    }
}
