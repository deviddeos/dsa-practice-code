package Queue;

class Node {
    int num;
    Node next;
    Node(int num) {
        this.num = num;
        this.next = null;
    }
}

class InnerDynamicQueue {
    Node front, rear = null;
    
    public void enqueue(int num) {
        Node p = new Node(num);
        if (rear == null && front == null) {
            rear = p; 
            front = p;
        } else {
            rear.next = p;
            rear = p;
        }
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty cannot Delete!");
            return;
        }
        System.out.println("Deleted: "+front.num);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public void traverse() {
        if (front == null && rear == null) {
            System.out.println("Queue is Empty cannot travers!");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.num);
            temp = temp.next;
        }
    }
}

public class DynamicQueue {
    public static void main(String[] args) {
        InnerDynamicQueue  q = new InnerDynamicQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.traverse();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.traverse();
    }
}
