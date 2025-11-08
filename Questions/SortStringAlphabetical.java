
class InnerSortStringAlphabetical {

    public void sortString() {
        String str  = "prince gupta";
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length-1; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        for (char c : ch) {
            System.out.print(c);
        }
    }
}

public class SortStringAlphabetical {
    public static void main(String[] args) {
        InnerSortStringAlphabetical d = new InnerSortStringAlphabetical();
        d.sortString();
    }
}
