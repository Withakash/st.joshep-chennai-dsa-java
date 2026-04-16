class Addition {

    // int add(int a , int b){
    //     // System.out.println(a+b);
    //     return a + b;
    // }

    // int add(int a, int b,int c) {
    //     // System.out.println(add(a,b) + c);
    //     return add(a,b) + c;
    // }

    // int add(int a, int b, int c,int d) {
    //     // System.out.println(add(a,b,c)+d);
    //     return add(a,b,c) + d;
    // }

    int add(int... numbers){     //VarArgs (Variable Arguments)
        int sum = 0;

        for(int x : numbers){
            sum += x;
        }

        return sum;
    }


    
}

public class MainUser{
 public static void main(String[] str){
   Addition a = new Addition();
     System.out.println(a.add(10,10));
     System.out.println(a.add(10,20,30));
     System.out.println(a.add(10,20,30,40,30,4,0,5,7,8,9,100));
  }
}



