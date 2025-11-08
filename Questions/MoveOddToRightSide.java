class InnerMoveOddToRightSide {
    public void moveOdd() {
        int[] num = { 2, 4, 5, 67, 8, 9, 2,3 ,4 , 7};
        int index =0;
        int result[] = new int[num.length];

        for (int i = 0; i < result.length; i++) {
            if (num[i] % 2== 0) {
                result[index++] = num[i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (num[i] % 2 != 0) {
                result[index++] = num[i];
            }
        }

        for (int i : result) {
            System.out.print(i+" ");
        }
    }
    
}

public class MoveOddToRightSide {
    public static void main(String[] args) {
        InnerMoveOddToRightSide d = new InnerMoveOddToRightSide();
        d.moveOdd();
    }
}
