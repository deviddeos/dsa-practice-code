class Node {
  int num;
  Node next;

  Node(int num) {
    this.num = num;
    this.next = null;
  }
}

class InnerDynamicStack1 {

  Node top = null;

  public void push(int num) {
    Node p = new Node(num);
    if (top == null) {
      top = p;
    } else {
      p.next = top;
      top = p;
    }
  }

  public void pop() {
    if (top == null) {
      System.out.println("Stack is Empty, Can't Pop!");
    } else {
      top = top.next;
    }
  }

  public void traverse() {
    if (top == null) {
      System.out.println("Stack is empty can't Traverse.");
    } else {
      Node temp = top;
      while (temp != null) {
        System.out.print(temp.num + "\t");
        temp = temp.next;
      }
      System.out.println();
    }
  }
}

public class DynamicStack1 {

  public static void main(String[] args) {
    InnerDynamicStack1 s = new InnerDynamicStack1();
    s.pop();
    s.push(10);
    s.push(20);
    s.push(30);
    s.traverse();
    s.pop();
    s.traverse();
  }
}
