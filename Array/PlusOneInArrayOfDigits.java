public class PlusOneInArrayOfDigits {

    static int plusOne(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num*10 + arr[i];
        }
        return num +1;
    }
    public static void main(String[] args) {
        int num[] = {9,9,9};
        System.out.println(plusOne(num));
    }
}
