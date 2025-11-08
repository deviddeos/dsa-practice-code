class InnerLargerElementOf_Its_rightSide {

    public void largestOfRightSide() {
        int[] num = {16, 17, 4, 3, 5, 2};
        int last = num.length;

        for (int i = 0; i < num.length; i++) {
            int max = -1;
            for (int j = i+1; j < num.length; j++) {
                if (num[j] > max) {
                    max = num[j];
                }
            }
            num[i] = max;
        }

        for (int i : num) {
            System.out.print(i+ " ");
        }
    }
}

public class LargerElementOf_Its_rightSide {
    public static void main(String[] args) {
        InnerLargerElementOf_Its_rightSide d= new InnerLargerElementOf_Its_rightSide();
        d.largestOfRightSide();
    }
}
