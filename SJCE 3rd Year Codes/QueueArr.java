
public class QueueArr {
    int arr[];
    int size;
    int capacity;
    int front;
    int rear;

    QueueArr(int c) {
        capacity = c;
         arr = new int[capacity];
         size = 0;
         front = 0;
         rear = -1;
    }

    boolean isFull(){
        if(rear+1 == capacity || size == capacity) return true;
        return false;
    }

    boolean isEmpty(){
        if(size == 0) return true;
        return false;
    }

    void enque(int val) {
        if(isFull()) {
            System.out.println("Queue is Full!!");
            return;
        }
        rear = rear + 1;
        arr[rear] = val;
        size++;
    }


    int deque(){
        if(isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        }
        int temp = arr[front];
        front = front + 1;
        size--;
        return temp;
    }

    int front(){
        if(isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        return arr[front];
    }


    void print(){
        for(int i = front; i <= rear ; i++){
            System.out.print(arr[i] + " ");
        }
    }



    public static void main(String[] args){
        QueueArr q = new QueueArr(6);

        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.enque(60);    
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        // System.out.println(q.front());
        q.print();
        q.enque(70);
    }
}
