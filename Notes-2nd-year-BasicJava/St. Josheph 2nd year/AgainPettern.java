public class AgainPettern {
    public static void main(String[] str){
        //    * * * * 
        //    * * * 
        //    * * 
        //    * 
        int n = 4;
       
       for(int i = 1 ; i <= n ; i++ ){
          for (int j = i ; j <= n ;  j++){
            System.out.print("* ");
        }
        System.out.println();
       }
        
    }
}
