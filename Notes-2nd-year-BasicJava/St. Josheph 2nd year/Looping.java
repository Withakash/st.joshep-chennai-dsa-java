public class Looping {
    public static void main(String[] st){
        // int x = 1;                   
        // while(x <= 100){              
        //     System.out.print(x + " ");  
        //     x++;                  
        // }


        // int choice;
        // do{
        //     System.out.println("1. Add");    
        //     System.out.println("2. Subtract");
        //     System.out.println("3. Exit");

        //     choice = 2;
        // }while(choice != 3);

        // for(int i = 1,j = 2; i <= 10 && j <= 20 ; i++,j = j + 2){
        //       System.out.println(i + " -> "+ j);
        // }
        
        // break;
        // continue;

        //  for(int i = 1 ; i < 11 ; i++){

        //     if(i == 8) continue;
        //     System.out.print(i + " ");
        //  }

    //     int i=1;
    //    while(i<=5){
    //    System.out.print(++i);
    //     } 
//     int i=1;
// do{
//     System.out.print(i);
// }while(i++<3);

    //      int n = 5;
    //      int sum = 0;
    //      for(int i = 1; i <= n ; i++){
    //         sum = sum + i;
    //      }
    //   System.out.println("Res : "+ sum);

        //  1  2  3 
        //  1  2  3
        //  1  2  3

        int n = 4 ;
        for(int i = 1; i <= n ; i++){    //Rows
            for(int j = 1 ; j <= i ; j++){  //col
                System.out.print("* ");
            }

            System.out.println();
        }
            

        //   1
        //   1  2
        //   1  2  3
        //   1  2  3  4

        
       


    }
}
