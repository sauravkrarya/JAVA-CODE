class pattern12{
    public static void main(String[] args) {

        for(int i=0; i<4; i++)
        {
           for(int j=4; j>i; j--)
           System.out.print(" ");

           for(int k=0; k<=i; k++)
           System.out.print("#");

           for(int k=0; k<=i-1; k++)
           System.out.print("#");

           System.out.println();
        }
        

        for(int i=1; i<=4; i++){

            for(int j=1 ;j<=i; j++)
                System.out.print(" ");

            for(int k=4; k>=i; k--)
                System.out.print("#");

            for(int k=4; k>i; k--)
                System.out.print("#");
    
            System.out.println();
        }
    }
}