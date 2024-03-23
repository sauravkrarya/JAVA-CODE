/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user, Number of classes held,Number of classes attended.
And print percentage of class attended Is student is allowed to sit in exam or not.
 */

import java.util.*;
public class studentexam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total classes which held this year");
        double h=sc.nextDouble();

        System.out.print("Enter the number of classes attended: ");
        double  a=sc.nextDouble();
        
        double t= a/h * 100;
        System.out.println(t +" %");

        if (t>=75 && a<h){
            System.out.println("you are allowed to seat in exam");
        }

        else if(a>h){
            System.out.println("wrong entry,please check");
        }
        else{
            System.out.println("System.out.println(x:\"You are not allowed to sit in exam because your attendance in less than 75%");
            System.out.print( "Medical cause? (y/n) ) : ");

            char input= sc.next().charAt(0);

            if(input=='y' || input=='Y')
            System.out.print("You are allowed to sit in exam");

            else
                System.out.println("you are not allowed to seat in exam");
            
        }
    
    }
    
}
