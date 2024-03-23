/* A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
      Ask user for quantity Suppose, one unit will cost 100.Judge and print total cost for user.*/


import java.util.*;
  class shop {
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the quantity which you bought");
        int quantity=sc.nextInt();
        int totalcost = quantity*100;
        System.out.println("total cost of units: " + totalcost);

        if (quantity>1000){
            System.out.println("discount applicable over buying 1000 products");
            int discount = (10 * quantity)/100;
            totalcost -=discount;
            System.out.println("cost after discount "+ totalcost);

               }
       }
    
}
