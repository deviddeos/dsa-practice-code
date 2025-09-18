package Queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    public static void enqueue(int num) {
        stack1.push(num);
    }

    public static Integer dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is Empty.");
            return null;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
            }
        }
       
        return stack2.pop();
    }

    public static void traverse() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is Empty.");
        }
        
        for (int i = stack2.size()-1; i >= 0; i--) {
            System.out.print(stack2.get(i)+" ");
        }

        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        System.out.println("Dequeue: "+ dequeue());
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        System.out.println("Dequeue: "+ dequeue());
        System.out.println("Dequeue: "+ dequeue());
        System.out.println("Dequeue: "+ dequeue());
        System.out.println("Dequeue: "+ dequeue());
        System.out.println("Dequeue: "+ dequeue());
        traverse();

    }
}
