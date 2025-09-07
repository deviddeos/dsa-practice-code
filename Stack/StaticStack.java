class MyStack1 {
    int arr[] = new int[10];
    int top = -1;

    void push(int num) {
        if (top == arr.length-1) {
            System.out.println("Stack is Full.");
        } else {
            top++;
            arr[top] = num;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty, Can't Delete!");
        } else {
            top--;
        }
    }

    void traverse() {
        if (top == -1) {
            System.out.println("Stack is Empty.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i]+" ->");
            }
            System.out.println("NULL");
        }
    }
}

public class StaticStack {
    public static void main(String[] args) {
        MyStack1 s = new MyStack1();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.traverse();
    }
}
