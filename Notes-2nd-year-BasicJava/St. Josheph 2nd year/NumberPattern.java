public class NumberPattern {
    public static void main(String[] s){
        // int n = 4;
        // for(int i = 1 ; i <= n ; i++){
        //     for(int j = i; j <= n-1 ; j++){
        //         System.out.print("  ");
        //     }

        //     for(int k = 1; k <= i ; k++){
        //         System.out.print(i + " ");
        //     }

        //     for(int k = 2; k <= i ; k++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        //  int n = 4;
        // for(int i = 1,v = n ; i <= n ; i++,v--){
        //     for(int j = i; j <= n-1 ; j++){
        //         System.out.print("  ");
        //     }

        //     for(int k = 1; k <= i ; k++){
        //         System.out.print(v + " ");
        //     }

        //     for(int k = 2; k <= i ; k++){
        //         System.out.print(v + " ");
        //     }
        //     System.out.println();
        // }

        //  int n = 4;
        // for(int i = 1,v = 0 ; i <= n ; i++,v += 2){
        //     for(int j = i; j <= n-1 ; j++){
        //         System.out.print("  ");
        //     }

        //     for(int k = 1; k <= i ; k++){
        //         System.out.print(v + " ");
        //     }

        //     for(int k = 2; k <= i ; k++){
        //         System.out.print(v + " ");
        //     }
        //     System.out.println();
        // }

        //  int n = 4;
        // for(int i = 1; i <= n ; i++){

        //     for(int k = 1; k <= i ; k++){
        //         if(i % 2 == 0)
        //         System.out.print("$ ");
        //         else 
        //             System.out.print("# ");
        //     }
        //     System.out.println();
        // }

        int n = 4 , v = 1;
        for(int i = 1; i <= n ; i++){

            for(int k = 1; k <= i ; k++){
                    System.out.print(v++ +" ");
            }
            System.out.println();
        }
    }
}



// 1     Flyod Tringle
// 2 3
// 4 5 6
// 7 8 9 10