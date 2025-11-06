public class ThirdLargestElement {
    public static int thirdLargest(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > first) {
        //         first = nums[i];
        //     }
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > second && nums[i] < first) {
        //         second = nums[i];
        //     }
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > third && nums[i] < second) {
        //         third = nums[i];
        //     }
        // }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] > second && nums[i] < first) {
                third = second;
                second = nums[i];
            } else if (nums[i] > third && nums[i] < second) {
                third = nums[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        return (first * second * third);
    }

    public static void sortElements(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int s: nums) {
            System.out.print(+s+ ", ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {23, 113, 4, 22, 44, 19, 10};
        System.out.println(thirdLargest(nums));
        sortElements(nums);
    }
}
