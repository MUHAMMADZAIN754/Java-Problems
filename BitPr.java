
import java.util.Scanner;
public class BitPr {
 // Its code to convert the binnary to decimal    
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);

System.out.println("enter the binnary of number");

int number=sc.nextInt();


    int i=0;
  int result=0;
  
  while (number!=0)
  {
     int digit=number%10;

     if (digit==1)
     {
      result=(int)(result+(digit*Math.pow(2,i)));
     }
     number=number/10;
    i++;
      
  }

   System.out.println(" After converting the decimal number into binnar is  "+result);

}    
}
