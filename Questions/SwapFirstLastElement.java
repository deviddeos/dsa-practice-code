class SwapElement{
    public int[] FirstLast() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        arr[0] = arr[0]+arr[n-1];
        arr[n-1] = arr[0] - arr[n-1];
        arr[0] = arr[0]- arr[n-1];

        return arr;
    }
}

public class SwapFirstLastElement {
    public static void main(String[] args) {
        SwapElement s = new SwapElement();
        int num[] = s.FirstLast();

        for(int n: num) {
            System.out.print(n+ " ");
        }
    }
}
