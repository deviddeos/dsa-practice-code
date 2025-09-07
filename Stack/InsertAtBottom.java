import java.util.Stack;
public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Before inserting : " + st);
        insertAtBottom(st, 900);
        System.out.println("After Inserting: "+st);
    }

    public static void insertAtBottom(Stack<Integer> stack, int num) {
        if (stack.isEmpty()) {
            stack.push(num);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, num);
        stack.push(top);
    }
}
