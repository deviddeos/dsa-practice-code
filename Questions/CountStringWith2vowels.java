class InnerCountStringWith2vowels {
    public void stringWithTwoVowels() {
        String str[] = {"India", "Nepal", "sdd", "hj"};
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toLowerCase();
            int vowels = 0;
            for (int j = 0; j < str[i].length(); j++) {
                char ch = str[i].charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
            }
            if(vowels >= 2) {
                count++;
            }
        }
        System.out.println("Total number of String that have atleast two vowels: " + count);
    }
}

public class CountStringWith2vowels {
    public static void main(String[] args) {
        InnerCountStringWith2vowels d= new InnerCountStringWith2vowels();
        d.stringWithTwoVowels();
    }
}
