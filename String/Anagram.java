class InnerAnagram {
    public boolean anagram(){
        String str1 = "listen", str2 = "lists";
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = sortString(str1);
        str2 = sortString(str2);

        return str1.equals(str2);
    }
    public String sortString(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length()-1; i++) {
            for (int j = 0; j < s.length()-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }
}
public class Anagram {
    public static void main(String[] args) {
        InnerAnagram d = new InnerAnagram();
        System.out.println(d.anagram());
    }
}