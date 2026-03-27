public class SparseMetrix {
    Node head = null;

    static class Node{
        int r,c,val;
        Node next;

        Node(int row, int col,int val)  {
               r = row;
               c = col;
               this.val = val;
               next = null;

               System.out.println("C is Created with Value : " + val + " at indexs Row & Col :" + r + " " + c );
        }
    }

    void insert(int r, int c,int val){
        Node new_node = new Node(r,c,val);

        if(head == null) {
           head = new_node;
           return; 
        }

        new_node.next = head;
        head = new_node;
    }

    void display(){
        Node curr = head;

        while(curr != null) {
            System.out.print(" value : " + curr.val + " index : "+curr.r+curr.c);

            curr = curr.next;
        }


    }


    public static void main(String[] str) {
        SparseMetrix sm = new SparseMetrix();
        sm.insert(1,2,55);
        sm.insert(2,1,55);
        sm.insert(3,1,75);

        sm.display();
    }
}
