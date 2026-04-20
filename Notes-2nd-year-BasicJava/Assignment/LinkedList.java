public class LinkedList {
  Node head;
  int size = 0;

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
    size++;
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
    size++;
  }

  void deleteAtFirst(){
    if(head == null) {
      System.out.println("LinkedList is Already Empty !!");
      return;
    }

     head = head.next;
     size--;
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
    size--;
  }

  void linkedListSum(){
      Node curr = head;
      int res = 0;
      while(curr != null){
         res = res + curr.val;
         curr = curr.next;
      }

      System.out.println(res);
      
  }

  void insertAtGiven(int val,int pos){
    Node new_node = new Node(val);
    if (head == null) {
      head = new_node;
      return;
    }
    if (pos < 1 || pos > size + 1)
    {
      System.out.println("Invalid position");
      return;
    }
    if(pos == 1){
      new_node.next = head;
      head = new_node;

      size++;
      return;
    }
    Node curr = head;
    for(int i = 1 ; i < pos-1 ; i++){
      curr = curr.next;
    }
    new_node.next = curr.next;
    curr.next = new_node;
    size++;
  }

  void printMax(){
    int max = head.val;
    Node curr = head.next;

    while(curr != null){
      if(curr.val > max){
        max = curr.val;
      }
      curr = curr.next;
    }

    System.out.println("Max Number in LL is : " + max);
  }



  void deleteAtGiven(int pos){
    if (head == null) {
      System.out.println("LinkedList is Already Empty !!");
      return;
    }

    if(pos < 1 || pos > size + 1){
      System.out.println("Invalid Posistion");
      return;
    }

    if(pos == 1){
      head = head.next;
      size--;
      return;
    }

    Node curr = head;
    for(int i = 1 ; i < pos-1 ; i++){
        curr = curr.next;
    }
    
    curr.next = curr.next.next;
     size--;
  }




  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insertAtLast(10);
    ll.insertAtLast(20);
    ll.insertAtLast(30);
    ll.insertAtLast(40);
    ll.insertAtLast(50);
    // ll.deleteAtGiven(1);
    ll.insertAtGiven(5, 1);
    ll.deleteGivenVal(30);

    ll.print();
    // ll.printMax();

  }
}
