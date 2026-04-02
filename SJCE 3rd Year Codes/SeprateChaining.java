
import java.util.LinkedList;
@SuppressWarnings("unchecked")
public class SeprateChaining {

    LinkedList<Integer>[] table;
    int size ;

    SeprateChaining(int cap){
        size = cap;
        table = (LinkedList<Integer>[]) new LinkedList[size];
        
        for(int i = 0 ; i < size ; i++){
            table[i] = new LinkedList<>();
        }
    }

    void insert(int key){
        int index = key % size;
        table[index].add(key);
    }

    boolean search(int key){
        int index = key % size;
        return table[index].contains(key);
    }

    // void delete(int key){
    //     int index = key % size;
    //     table[index]
    // }

    void print(){
        for(int i = 0 ; i < size  ; i++){
            System.out.print(i + " -> ");
            for(int x : table[i]){
                System.out.print(x + " ");
            }  
            System.out.println();
        }
    }
    public static void main(String[] str){
        int[] arr = new int[]{25,35,28,11,38,72,93,53,99,50};

        SeprateChaining students = new SeprateChaining(10);

        for(int x : arr){
            students.insert(x);
        }

        System.out.println("Key is found " + students.search(25));
        students.insert(35);
        System.out.println(students.search(25));
        students.print();
    }
}
