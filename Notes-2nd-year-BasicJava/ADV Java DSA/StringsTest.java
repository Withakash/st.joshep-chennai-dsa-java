public class StringsTest {
    public static void main(String[] args){
        // char[] str  = {'A','k','a','s','h'};

        // for(char ch : str)
        // System.out.print(ch);

        // String str0 = "Akash";
        // String str1 = new String("Akash");
        // String str2 ="Akash";
        // String str3 ="Akash";
        // String str4 = new String("Akash");

        // System.out.println(str1==str4);
        // System.out.println("Str0 "+ str0.hashCode());
        // System.out.println("Str1 " + str1.hashCode());
        // System.out.println("Str2 " + str2.hashCode());
        // System.out.println("Str3 " + str3.hashCode());
        // System.out.println("Str4 " + str4.hashCode());


        // String name = "Akash";
        // name = name.concat(" yadav");
        // name = new String("Akash Yadav");

        // StringBuilder sb = new StringBuilder("Akash");
        // // name.append(" Yadav");
        //  sb.insert(4,"_");

        // System.out.println(sb);

        String str = "Akash";
        System.out.println(str.charAt(4));




        //SCP   <--- Heap
    }
                        //     heap ("Akash")            SCP   (Akash)
                        //    ------------------          -------
}                       //                                 str str2  (Akash )





// Mutable      Unmutable
//    > StringBuilder             //  -> String