public class CircularLinkedList {
    Node head = null;
    static class Node {
        int val;
        Node next;

        Node(int v ){
            val = v; 
        }
    }
    
    void insertAtFirst(int val) {
     Node new_node = new Node(val);
        if(head == null) {
             new_node.next = new_node;
             head = new_node;
             return;
        }

        Node curr = head;

        while(curr.next != head) {
            curr = curr.next;
        }

        curr.next = new_node;
        new_node.next = head;
        head = new_node; 
    }

    void display() {
        if(head == null) return;

        Node curr = head;

        do {
            System.out.print(curr.val + " ");
            curr = curr.next;
        } 
        while(curr != head) ;
         
    }

    void insertAtLast(int val) {
        Node new_node = new Node(val);
        if(head == null) {
             new_node.next = new_node;
             head = new_node;
             return;
        }

        Node curr = head;
        while(curr.next != head) {
            curr = curr.next;
        }

        curr.next = new_node;
        new_node.next = head;
    }
     
    void deleteAtFirst() {
        if(head == null) return;

        if(head.next == head) {
            head = null;
            return;
        }

        Node curr = head;
        while(curr.next != head) {
            curr = curr.next;
        }

        curr.next = head.next;
        head = head.next;
    }

    void deleteAtLast(){
        if(head == null || head.next == head) {
            head = null;
            return;
        }

        Node curr = head;
        while(curr.next.next != head) {
            curr = curr.next;
        }

        curr.next = head;
    }


     public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtFirst(10);
        cll.insertAtFirst(20);
        cll.insertAtLast(55);
        cll.deleteAtFirst();
        cll.deleteAtLast();
        cll.display();
     }
}
