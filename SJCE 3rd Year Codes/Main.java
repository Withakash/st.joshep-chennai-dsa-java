 class MinHeap {
    int[] arr;
    int size;
    int capacity;

    MinHeap(int cap){
        capacity = cap;
        size = 0;
        arr = new int[cap];
    }

    int parent(int i){
        return (i-1)/2;
    }

    int left(int i ){
        return 2*i + 1;
    }

    int right(int i){
        return 2*i + 2;
    }

    void insert(int val){
        if(size == capacity) return;

        arr[size] = val;
        int i = size;
        size++;

        while(i != 0 && arr[i] < arr[parent(i)]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;

            i = parent(i);

        }
    }

    void heapify(int i){
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if(l < size && arr[l] < arr[smallest])
             smallest = l;
        if(arr[r] < arr[smallest])
             smallest = r;

        if(r < size && smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            heapify(smallest);
        }

    }

    int deleteMin(){
        if(size <= 0) return -1;
        int root = arr[0];
        arr[0] = arr[size-1];
        size--;

        heapify(0);
        return root;
    }

    int getMin(){
        if(size == 0) return -1;
        return arr[0];
    }

    void print(){
        for(int x = 0 ; x < size ; x++){
            System.out.print(arr[x] + " ");
        }
    }

}

class MyPriorityQueue{
    MinHeap heap;

    MyPriorityQueue(int cap){
        heap = new MinHeap(cap);
    }
    void add(int val){
        heap.insert(val);
    }
    int poll(){
        return heap.deleteMin();
    }

    int peek(){
        return heap.getMin();
    }

    boolean isEmpty(){
        return heap.size == 0;
    }

    int size(){
        return heap.size;
    }

    void print(){
       heap.print(); 
    }
}

public class Main{
    public static void main(String[] args){
        MyPriorityQueue pq = new MyPriorityQueue(10);

        pq.add(9);
        pq.add(7);
        pq.add(8);
        pq.add(6);
        pq.add(10);
        pq.add(5);
        pq.add(2);

        System.out.println("Size : " + pq.size());
        System.out.println("Peek Element " + pq.peek());

        pq.poll();
        pq.print();


    }
}
