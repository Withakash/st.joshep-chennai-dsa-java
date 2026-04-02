public class DoublyLinkedList {
    Node head = null;

    static class Node {
        Node next, prev;
        int val;

        Node(int v) {
            val = v;
            prev = next = null;

            System.out.println(val + " : C Created ");
        }
    }

    void insertAtFirst(int val) {
        Node new_node = new Node(val);

        if (head == null) {
            head = new_node;
            return;
        }

        head.prev = new_node;
        new_node.next = head;
        head = new_node;
    }

    void insertAtLast(int val) {
        Node new_node = new Node(val);
        if (head == null) {
            head = new_node;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new_node;
        new_node.prev = curr;
    }

    void deleteAtFirst() {
        if (head == null)
            return;

        head = head.next;

        if (head != null)
            head.prev = null;
    }

    void deleteAtLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.prev.next = null;
    }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] str) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtFirst(10);
        dll.insertAtFirst(5);
        dll.insertAtFirst(1);
        dll.insertAtLast(55);
        dll.insertAtLast(75);
        dll.deleteAtFirst();
        dll.deleteAtLast();

        dll.display();
    }
}
