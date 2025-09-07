import java.util.Stack;

class InnerCelebrityProblem {

    public int celebrity(int[][] arr) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            s.push(i);
        }

        while (s.size() > 1) {
            int i = s.pop();
            int j = s.pop();

            if (arr[i][j] == 0) {
                s.push(i);
            } else {
                s.push(j);
            }
        }

        int celebrity = s.peek();
        for (int i = 0; i < arr.length; i++) {
            if (i != celebrity && ( arr[i][celebrity] == 0 || arr[celebrity][i] == 1)) {
                return -1;
            }
        }

        return celebrity;
    }
}
public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] arr = { {0, 1, 0}, {0, 0, 0}, {0, 1, 0} };
        InnerCelebrityProblem c = new InnerCelebrityProblem();
        int celebrity = c.celebrity(arr);
        System.out.println("The celebrity is : "+celebrity);
    }
}
