public class MinHeap {
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
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
     public static void main(String[] argm){
        MinHeap hp = new MinHeap(7);
        hp.insert(9);
        hp.insert(7);
        hp.insert(8);
        hp.insert(6);
        hp.insert(10);
        hp.insert(5);
        hp.insert(2);

        hp.deleteMin();
        hp.deleteMin();

        System.out.println(hp.getMin());

        hp.print();
     }
}
