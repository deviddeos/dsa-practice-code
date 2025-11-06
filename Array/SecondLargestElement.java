class LargestElement {
    public void large(int[] nums) {
        int secondLargest = -1;
        int largest = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }
        }

        System.out.println("Second Largest Number is: "+ secondLargest);
        System.out.println("Largest Number is: "+ largest);

    }
}
public class SecondLargestElement {

    public static void main(String[] args) {
        int nums[] = {23, 113, 4, 22, 44, 19, 10};

        LargestElement obj = new LargestElement();
        obj.large(nums);

    }
}