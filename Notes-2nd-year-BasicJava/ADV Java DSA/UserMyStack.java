
class MyStack {
    int capacity;
    int[] arr;
    int top ;

    MyStack(int cap){
        capacity = cap;
        arr = new int[capacity];
        top = -1;
        // System.out.println("Const created  with cap : " + capacity);
    }

    boolean push(int val){
        if(top + 1 == capacity){
            System.out.println("Stack OverFlow !!");
            return false;
        }
        arr[++top] = val;
        return true;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack UnderFlow !!");
            return -1;
        }
        // int temp = arr[top];
        // top--;
        // return temp;
        return arr[top--];
    }


    int peek(){
        if (top == -1) {
            System.out.println("Stack UnderFlow !!");
            return -1;
        }     
        return arr[top];  
    }


    boolean isEmpty(){
       return top == -1;
    }

    boolean isFull(){
       return top  == capacity-1;
    }

    void print(){
        for(int i = 0 ; i <= top ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}


class MinStack{

}


public class UserMyStack{
    public static void main(String[] str){
    Min
       
    }
}
