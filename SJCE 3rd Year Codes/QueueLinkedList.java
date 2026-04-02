public class QueueLinkedList {
    public static class Node{
    int data;
    Node next;
     Node(int val){
        data = val;
        next = null; 
     }
    }

     Node front = null;
     Node rear = null;

     boolean isEmpty(){
      if(front== null && rear == null) return true;
      return false;
     }

     void enqueue(int val){
        Node new_node = new Node(val);

        if(front == null && rear == null){
            front = rear = new_node;
            return;
        }

        rear.next= new_node;
        rear = new_node;
     }

     int dequeue(){
      if(front == null && rear == null) {
         System.out.println("Queue is Empty");
           return -1;
      }

      int temp = front.data;
      front = front.next;
      if(front == null) rear = null;

      return temp;
     }

     void print(){

        if(front == null) {
           System.out.println("Queue is Empty");
           return;
        } 
        Node curr = front;

        while(curr != null) {
            System.out.print(curr.data +" ");
            curr = curr.next;
        }
     }

     int front(){
      if(isEmpty()) return -1;
      return front.data;
     }

     public static void main(String[] str ){
        QueueLinkedList qll = new QueueLinkedList();
        qll.enqueue(10);
        qll.enqueue(20);
        qll.enqueue(30);
        qll.dequeue();
        qll.dequeue();
        qll.dequeue();



        qll.print();

     }

}
