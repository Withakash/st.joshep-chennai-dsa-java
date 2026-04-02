public class StackArr {
     int top;
     int[] arr;
     int size;

     StackArr(int s) {
      size = s;
      top = -1;
      arr = new int[size];
     }

     void push(int val) {
        if(top + 1 == size ) 
            System.out.println("Stack OverFLow !!");

        arr[++top] = val;
          //  System.out.println(val + " : pushed ");
     }

     int pop() {
      if(top == -1) {
         System.out.println("Stack Underflow !!");
         return -1;
     }

      int temp = arr[top];
      top = top -1;
      return temp;
     }

     int peek(){
      if(top == -1) {
         System.out.println("Stack Underflow !!");
         return -1;
     }

     return arr[top];
     }

     boolean isEmpty(){
      if(top == -1) return true;
      return false;
     }

     boolean isFull(){
      if(top + 1 == size) return true;
      return false;
     }

     void print(){
      for(int i = top ; i >= 0 ; i--) {
        System.out.println(arr[i]);
      }
     }


  public static void main(String[] str){
       StackArr st = new StackArr(7);
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       st.push(60);
       st.push(70);
      //  st.push(80);

      st.pop();
      st.pop();
      st.pop();
      st.pop();
      st.pop();
       st.print();

  }  
}
