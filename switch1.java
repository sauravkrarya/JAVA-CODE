
import java.util.*;
class switch1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("wednesday");
            break;
            case 4: System.out.println("thrsday");
            break;
            case 5: System.out.println("friday");
            break;
            case 6: System.out.println("saturday");
            break;
            case 7: System.out.println("sunday");
            break;
            default: System.out.println("wrong choice, please input valid input");
        
        }
    }
    
}
