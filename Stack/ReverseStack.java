import java.util.Stack;

public class ReverseStack {
    public static void insertAtBottom(Stack<Integer> st, int top) {
        if (st.isEmpty()) {
            st.push(top);
        } else {
        int a = st.pop();
        insertAtBottom(st, top);
        st.push(a);
        }
    }

    public static void reverse(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int top = st.pop();
            reverse(st);
            insertAtBottom(st, top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Before Reverse: "+st);
        
        reverse(st);
        System.out.println("\nAfter Reverse: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop()+ "\t");
        }
    }
}
