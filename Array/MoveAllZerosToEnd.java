public class MoveAllZerosToEnd {
    static void removeZeroToEnd(int[] arr) {
        int temp[] = new int[arr.length];
        int index = 0;
    
        for (int i = 0; i < temp.length; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 0, 5, 0};
        removeZeroToEnd(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
