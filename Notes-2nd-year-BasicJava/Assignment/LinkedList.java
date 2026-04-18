public class LinkedList {
  Node head;

  static class Node {
    int val;
    Node next;

    Node(int v) {
      val = v;
      next = null;
      // System.out.println(val + " -> " + next);
    }
  }

  void print(){
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.val + " ");
      curr = curr.next;
    }
  }

  void insertAtFirst(int val){
    Node new_node = new Node(val);

    if(head == null) {
      head = new_node;
      return;
    }
    new_node.next = head;
    head = new_node;
  }

  void insertAtLast(int val){
    Node new_node = new Node(val);
    if(head == null) {
       head = new_node;
       return;
    }
    Node curr = head;
    while(curr.next != null){
      curr = curr.next;
    }

    curr.next = new_node;
  }

  void deleteAtFirst(){
    if(head == null) {
      System.out.println("LinkedList is Already Empty !!");
      return;
    }

     head = head.next;
  }


  void deleteAtLast(){
    if (head == null) {
      System.out.println("LinkedList is Already Empty !!");
      return;
    }

    Node curr = head;
    while(curr.next.next != null){
      curr = curr.next;
    }

    curr.next = null;
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insertAtFirst(10);
    ll.insertAtFirst(20);
    ll.insertAtFirst(30);
    ll.deleteAtFirst();
    ll.insertAtLast(44);
    ll.insertAtLast(55);
    ll.deleteAtLast();

    ll.print();

  }
}
