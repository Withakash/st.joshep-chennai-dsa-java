
class Node{
    int val;
    Node next;

    Node(int v) {
        this.val = v;
        this.next = null;
    }
}

public class StackLL {
    Node top;

    void push(int x) {
        Node new_node = new Node(x);
        if(top == null) {
          top = new_node;
          return;
          }

          new_node.next = top;
          top = new_node;
    }

    int pop(){
        if(top == null ) {
            System.out.println("Stack UnderFlow !!");
            return -1;
        }

        int temp = top.val;
        top = top.next;
        return temp;
    }

    int peek(){
        if(top == null) {
            System.out.println("Stack is Underflow !!");
            return -1;
        }
        return top.val;
    }

    boolean isEmpty(){
        return top == null;
    }

    void print() {
        Node curr = top;

        while(curr != null) {
            System.out.println(curr.val );
            curr = curr.next;
        }
    }

    public static void main(String[] str){
        StackLL st = new StackLL();

        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        st.pop();
        st.pop();
        st.pop();

        st.print();
    }
    
}
