public class CircularQueue {
    int capacity;
    int[] arr;
    int size ;
    int front;
    int rear;

    CircularQueue(int cap) {
        capacity = cap;
        arr = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isFull(){
        if(size == capacity) return true;
        return false;
    }

    boolean isEmpty(){
        if(size == 0 ) return true;
        return false;
    }

    void enque(int val) {
        if(isFull()) {
            System.out.println("Full !!");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
    }

    int deque(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
         int temp = arr[front];
        front = (front + 1)%capacity;
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
     if(isEmpty()){
         System.out.println("Empty");
         return;
     }

     int temp = front;
     for(int i =0 ; i < size ; i++){

        System.out.print(arr[temp]+ " ");
          temp = (temp + 1) % capacity;
     }

    }



    public static void main(String[] str) {
        CircularQueue cq = new CircularQueue(8);
          cq.enque(10);
          cq.enque(20);
          cq.enque(30);
          cq.enque(40);
          cq.enque(50);
          cq.enque(60);
          cq.enque(70);
          cq.deque();
          System.out.println(cq.front());
          cq.enque(80);
          cq.enque(90);
          cq.deque();
          cq.print();
          


    }
}




Depth → ROOT to node
Height → NODE to leaf