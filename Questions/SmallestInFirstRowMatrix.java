class InnerSmallestInFirstRowMatrix {
    public void smallestInFirstRow() {
        int num[][] = {{9, 2, 0}, {4, 5, 6}, {7, 8, 9}};
        int smallest = num[0][0];
        
        for (int i = 0; i < num[0].length; i++) {
            if (num[0][i] < smallest) {
                smallest = num[0][i];
            }
        }
        System.out.println(smallest);
    }
    
}

public class SmallestInFirstRowMatrix {
    public static void main(String[] args) {
        InnerSmallestInFirstRowMatrix d= new InnerSmallestInFirstRowMatrix();
        d.smallestInFirstRow();
    }
}
