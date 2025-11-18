public class FindVowelGreaterthanE {
    public static void main(String[] args) {
        String[] arr = {"ram", "shyam", "vinode", "arjun"};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                char ch = arr[i].charAt(j);
                if (ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
