import java.util.Scanner;
public class Numofones {

public static void main(String[]args)
{
   //Write a program to count the number of 1’s in a binary representation of the number.

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the binnary number");
    int num=sc.nextInt();
       int onesCount=0;
    while (num!=0)
    {
    
        int  bit=num%10;
    //onesCount=Integer.bitCount(bit);
    onesCount+=bit;
    num /=10;
    
    }
 
  System.out.println("The number of ones in the given binnary digit is "+onesCount);

}
}
