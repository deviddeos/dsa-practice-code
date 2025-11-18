public class RotateArrayByd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 3;
        int n = arr.length;

        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
