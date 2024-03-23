/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount. */

import java.util.*;
 class company {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
     System.out.println("enter your year of experience");
     int year=sc.nextInt();
    if (year>5){
        System.out.println("you'r elgible for bonus ");
        System.out.println("please enter your salary");
        double salary=sc.nextDouble();
        double bonus= (0.05 * salary);
        System.out.println("net salary with bonus:=" +(salary + bonus));
        
    
    }
    else{
        System.out.println("No you'r not eligible for bonus");
    }
    
    
    }
    
}
