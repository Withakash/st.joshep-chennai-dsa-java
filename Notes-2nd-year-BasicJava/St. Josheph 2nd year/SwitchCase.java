public class SwitchCase {
    public static void main(String[] str){
        int day = 1 ;
        switch(day){
            case 1: System.out.println("Mon"); break;
            case 2: System.out.println("Tue"); break;
            case 3: System.out.println("Wed"); break;
            case 4: System.out.println("Thu"); break;
            case 5: System.out.println("Fri"); break;
            case 6: System.out.println("Sat"); break;
            case 7: System.out.println("Sun"); break;
            default:System.out.println("Invalid Day");
        }

        int x = 1;
        switch(x){
        case 1: break;
        case 2:
        case 3: System.out.println("Group");
       }
    }
}
