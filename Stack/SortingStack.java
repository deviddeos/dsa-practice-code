import java.util.Stack;

public class SortingStack {

  public static void sortStack(Stack<Integer> s1) {
    Stack<Integer> s2 = new Stack<>();
    int a = s1.pop();
    s2.push(a);
    while (!s1.isEmpty()) {
      int top = s1.pop();
      while (!s2.isEmpty() && s2.peek() > top) {
        s1.push(s2.pop());
      }
      s2.push(top);
    }

    while(!s2.isEmpty()) {
        s1.push(s2.pop());
    }
  }
  
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(28);
    s.push(2);
    s.push(22);
    s.push(80);
    s.push(1);
    s.push(100);

    System.out.println("Original Stack: "+s);
    sortStack(s);
    System.out.println("Sorted Stack: "+s);
  }
}