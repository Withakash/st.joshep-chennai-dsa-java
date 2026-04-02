public class BasicHash {

    int[] table;
    int size ;

    BasicHash(int cap){
        size = cap;
        table = new int[size];
    }

    void insert(int key){
        int index = key % size;
        table[index] = key;
    }

    boolean search(int key){
        int index = key % size;
        return table[index] == key;
    }

    void delete(int key){
        int index = key % size;
        table[index] = 0;
    }

    void print(){
        for(int i = 0 ; i < size  ; i++){
            System.out.println(i + " -> " + table[i]);
        
        }
    }
    public static void main(String[] str){
        int[] arr = new int[]{25,11,38,72,93,99,50};

        BasicHash students = new BasicHash(10);

        for(int x : arr){
            students.insert(x);
        }

        System.out.println("Key is found " + students.search(25));
        students.insert(35);
        System.out.println(students.search(4));
        students.print();
    }
}
