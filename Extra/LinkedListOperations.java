public class LinkedList {
    Node head = null;

    static class Node{
       int data;
       Node next;

       Node(int val){
        data = val;
        next = null;
        System.out.println("Constructor created : "+ data);
       }
    }

    void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    void insertAtfirst(int val){
       
        Node new_node = new Node(val);
        if(head == null) {
            head = new_node;
            return ;
        }

        new_node.next = head;
        head = new_node;


    }

       public static void main(String[] args){
        LinkedList vb = new LinkedList();
         vb.insertAtfirst(10);
         vb.insertAtfirst(20);
         vb.insertAtfirst(30);

        vb.print();
       }
    
}
