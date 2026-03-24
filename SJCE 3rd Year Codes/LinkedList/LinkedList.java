
class LinkedList {
       Node head;
       static class Node{
           int data;
           Node next;
           
           Node(int val) {
               data = val;
               next = null;
           }
       }
         void print() {
              Node temp = head;
              while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
              }
         }

         void isSorted(Node head) {
            Node curr = head;

            while(curr != null && curr.next != null) {
                if(curr.data > curr.next.data) {
                    System.out.println("Linked List is Not SOrted");
                    return;
                 }
                 curr = curr.next;
                }
                System.out.println("Linked List is SOrted");
       }

       void findAverage(Node head) {

         int count = 0;
         int sum = 0;
        
         Node curr = head;

         while(curr != null) 
         {
            sum = sum + curr.data;
            count++;
            curr = curr.next;
         }

        System.out.println(sum / count);
       }


    public static void main(String[] args) {
        
        LinkedList Vb = new LinkedList();
        
        Vb.head = new Node(10);
        Vb.head.next = new Node(20);
        Vb.head.next.next = new Node(30);
        Vb.head.next.next.next = new Node(40);
        Vb.print();
        System.out.println();
        Vb.findAverage(Vb.head);
        System.out.println();
        // Vb.isSorted(Vb.head);


    }
}