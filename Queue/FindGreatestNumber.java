package Queue;

class Node {
    int num;
    Node next;
    Node (int num) {
        this.num = num;
        this.next = null;
    }
}

class InnerFindGreatestNumber {
    Node front = null;
    Node rear = null;

    public void enqueue(int num) {
        Node p = new Node(num);
        if (front == null && rear == null ) {
            front = p;
            rear = p;
        } else {
            rear.next = p;
            rear = p;
        }
    }

    public int greatestNumber() {
        if (front == null && rear == null) {
            System.out.println("Queue is Empty.");
            return -1;
        }
        Node temp = front;
        int greatestNumber = peek();
        while (temp != null) {
            if (temp.num >= greatestNumber) {
                greatestNumber = temp.num;
            }
            temp = temp.next;
        }
        return greatestNumber;
    }
    
    public int peek() {
        if (front == null && rear == null) {
            System.out.println("Queue is Empty.");
            return -1;
        }
        // System.out.println("Peek:" +front.num);
        return front.num;
    }
}
public class FindGreatestNumber {
    public static void main(String[] args) {
        InnerFindGreatestNumber q = new InnerFindGreatestNumber();
        q.enqueue(1);
        q.enqueue(90);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(6);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.greatestNumber());

    }
}
