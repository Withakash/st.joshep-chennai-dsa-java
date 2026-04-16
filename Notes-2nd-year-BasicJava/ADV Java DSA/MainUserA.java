
class ArrayADT {
    int[] arr;
    int size ;   //  always giving curr size
    int capacity;  // whole size of array

    ArrayADT(int cap){
        capacity  = cap;
        size = 0;
        arr = new int[capacity];
        // System.out.println("Array Created with cap " + capacity);
    }

    void print(){
        for(int i = 0 ; i < size ; i++){
             System.out.print(arr[i] + " ");
        }
    }

    void insertAtLast(int val){
        if(size == capacity){
            System.out.println("Array is FUll");
            return;
        }
        arr[size] = val;
        size++;
    }

    int deleteAtLast(){

       if(size == 0) {
        System.out.println("Array is Empty !");
        return -1;
       }

        int temp = arr[size-1];
        size--;

        return temp;
    }

    void insertAtFirst(int val){
        if (size == capacity) {
            System.out.println("Array is FUll");
            return;
        }

        for(int i = size ; i > 0 ; i--){
            arr[i] = arr[i-1];
        }

          arr[0] = val;
          size++;
    }

    int deleteAtFirst(){
        if (size == 0) {
            System.out.println("Array is Empty !");
            return -1;
        }
        int temp = arr[0];

        for(int i = 0; i < size ; i++){
            arr[i] = arr[i+1];
        }

        size--;
        return temp;
    }

    void insertAtGiven(int val, int pos){
        if (size == capacity) {
            System.out.println("Array is FUll");
            return;
        }

        if(pos > capacity || pos < 0) {
            System.out.println("Invalid Location ");
            return;
        }

        for(int i = size ; i > pos ; i--){
           arr[i] = arr[i-1];
        }

        arr[pos] = val;
        size++;
    }

    int deleteAtGiven(int pos){
        if(size == 0 ){
            System.out.println("Array is Empty");
            return -1;
        }

        if (pos > capacity || pos < 0) {
            System.out.println("Invalid Location ");
            return -1;
        }

        int temp = arr[pos];

        for(int i = pos ; i < size ; i++){
            arr[i] = arr[i+1];
        }

        size--;
        return temp;
    }

    int search(int key){
        for(int i = 0 ; i < size ; i++){
            if(key == arr[i]) return i;
        }
        return -1;
    }

    void insertAtValue(int val,int key){
        int index = search(key);

        insertAtGiven(val,index);
    }

    int deleteAtValue(int key){
        int index = search(key);

        return deleteAtGiven(index);
    }
    
    void update(int key,int val){
       int index = search(key);
       arr[index] = val;
    }

    void deleteAllElement(){
        while(size != 0){
            deleteAtLast();
        }

        System.out.println("All Elements are Deleted");
    }

    int get(int index){
    //    if(index > 0 || size < index) {
    //     System.out.println("Invalid index ");
    //     return -1;
    //    }

       return arr[index];
    }




}

public class MainUserA{
    public static void main(String[] str) {
    ArrayADT arr = new ArrayADT(10);

    for(int i = 1 ; i <= 10 ; i++){
        arr.insertAtLast(i*i);
    }

    int index = arr.search(4);
    System.out.println(index);

    }
}


// MinStack :
//             |     | 5  
//             |     | 4  
//             |     | 3  
//             |     | 2  
//             |  7  | 1  
//             |  10 | 0  
//                    -1  


                      