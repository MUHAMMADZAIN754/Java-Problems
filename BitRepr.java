import java.util.Scanner;;


 // Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.
   class  BitRep {

    public static void main(String []args)
    {

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number");
   
    int num=sc.nextInt();

    int i=0;
    int answer=0;

    while (num !=0)
    {
    
     int  bit=num & 1 ;
         answer=(int) (bit*Math.pow(10, i)+answer);
       num=num>>1;
       i++;
     }
System.out.println("After converting the "+num+"the binnary will be "+answer);

     }
}



