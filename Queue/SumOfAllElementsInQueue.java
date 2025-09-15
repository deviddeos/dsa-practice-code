package Queue;

class Node {
    int num;
    Node next;
    Node(int num) {
        this.num = num;
        this.next = null;
    }
}
class InnerSumOfAllElementsInQueue {
    Node front = null;
    Node rear = null;
    public void enqueue(int num) {
        Node p = new Node(num);
        if (front == null && rear == null) {
            front = p;
            rear = p;
        } else {
            rear.next = p;
            rear = p;
        }
    }

    public void traverse() {
        if (front == null && rear == null) {
            System.out.println("EMptyyy");
        }
        Node temp = front;
       
        while (temp != null) {
            System.out.println(temp.num);
            temp = temp.next;
        }
    }

    public int sumOfElement() {
        if (front == null && rear == null) {
            return 0;
        }
        Node temp = front;
        int sum = 0;
        while (temp != null) {
            sum += temp.num;
            temp = temp.next;
        }
        return sum;
    }

}
public class SumOfAllElementsInQueue {
    public static void main(String[] args) {
        InnerSumOfAllElementsInQueue q = new InnerSumOfAllElementsInQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(1);
        q.traverse();
        System.out.println("Sum of All Element is : " + q.sumOfElement());
    }
}
