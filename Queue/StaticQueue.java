package Queue;

class InnerStaticQueue {
    int[] arr = new int[5];
    int front = -1;
    int rear = -1;

    public void enqueue(int num) {
        if (rear == arr.length-1) {
            System.out.println("Queue is Full cannot insert!");
        } else {
            if (front==-1) {
                front=0;
            }
            rear++;
            arr[rear] = num;
        }
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty cannot Delete!");
        } else{
            System.out.println("Deleted: " + arr[front]);
            front++;
        }
    }

    public void traverse() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty cannot Traverse!!");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
public class StaticQueue {
    public static void main(String[] args) {
        InnerStaticQueue q = new InnerStaticQueue();
        // q.traverse();
        // q.dequeue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        // q.enqueue(60);
        q.traverse();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.traverse();

    }
}
