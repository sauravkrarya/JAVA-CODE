import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        int rev=0,rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        while (num>0){
        rem=num%10;
        System.out.println("rem"+ rem);
        rev=(rev*10)+rem;
        System.out.println("rev:"+ rev);
        num=num/10;
        System.out.println("num:"+ num) ;
          
      }
   }
  }
    

