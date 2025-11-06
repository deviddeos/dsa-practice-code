public class ReverseArrayInGroup {

  public static void reverseArray(int[] arr, int k) {
    int left = 0;
    int right = k;
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
    }
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int k = 3;
    reverseArray(nums, k);
    for (int s : nums) {
      System.out.print(s + " ");
    }
  }
}
