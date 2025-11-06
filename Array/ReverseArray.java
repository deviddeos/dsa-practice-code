public class ReverseArray {
    public static void reversElement(int[] nums) {
        int reverseArr[] = new int[nums.length];
        int index = 0;
        // for(int i = nums.length-1; i >= 0; i--) {
        //     reverseArr[index] = nums[i];
        //     index++;
        // }

        // for(int s: reverseArr) {
        //     System.out.print(s+ " ");
        // }


        int left = 0, right = nums.length-1;

        // while (left < right) {
        //     int temp = nums[left];
        //     nums[left] = nums[right];
        //     nums[right] = temp;
        //     left++;
        //     right--;
        // }


        int n = nums.length;
        for (int i = 0; i < n/2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i -1];
            nums[n-i-1] = temp;
        }
        
    }
    public static void main(String[] args) {
        int nums[] = {23, 113, 4, 22, 44, 19, 10};
        reversElement(nums);
        for (int s : nums) {
            System.out.print(s+ " ");
        }
    }
}
