public class Polynomial {
    Node head = null;

    static class Node{
        int coeff;
        int power;
        Node next;

        Node(int c , int p) {
            coeff = c;
            power = p;
            next = null;
            System.out.println(coeff+"a^"+power + " : is Createed");
        }
    }

    void display(){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.coeff+"a^"+curr.power +" + ");
            curr = curr.next;
        }
    }

    public static void main(String[]args){
        Polynomial poly = new Polynomial();
        poly.head = new Node(1,2);
        poly.head.next = new Node(2,1);
        poly.head.next.next = new Node(2,0);
        poly.display();
    }
}
