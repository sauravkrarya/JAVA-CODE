//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.*;
class lowerupper
{
        public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char alp=sc.next().charAt(0);
        int num=(int)alp;
        if (num>=97 && num<=122)
           {
                System.out.print ((char)(num-32));
           }
        else{
                System.out.print(alp);
            }
    }
}
