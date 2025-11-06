public class MaxConsecutiveBites {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0 , 0, 1};

        int maxCount = 0; 
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        System.out.println(Math.max(maxCount, count));

    }
}
