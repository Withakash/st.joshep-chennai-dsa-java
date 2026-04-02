public class DirectAddressing {

    int[] table;
    int size ;

    DirectAddressing(int max){
        int size = max;
        table = new int[size];
    }

    void insert(int key){
        table[key] = key;
    }

    boolean search(int key){
        return table[key] == key;
    }

    void delete(int key){
        table[key] = 0;
    }

    void print(){
        for(int i = 0 ; i < table.length+1  ; i++){
            System.out.println(i + " -> " + table[i]);
        
        }
    }
    public static void main(String[] str){
        int[] arr = new int[]{40,70,10,90,60,30,100};

        DirectAddressing students = new DirectAddressing(101);

        for(int x : arr){
            students.insert(x);
        }

        // System.out.println(students.search(4));
        // students.delete(4);
        // System.out.println(students.search(4));
        students.print();
    }
}
