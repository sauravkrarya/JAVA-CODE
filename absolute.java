/* Write a program to print absolute value of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1 */

import java.util.*;
public class absolute {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
   if (num<0)
     System.out.println(num*(-1));
   else
     System.out.println(num);

  }
}
