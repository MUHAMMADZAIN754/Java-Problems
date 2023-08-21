

import java.util.Scanner;
public class ToggleProb {

public static void main(String []args)
{

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number whose   ");
    int num=sc.nextInt();

    System.out.println("enter the position");
    int pos=sc.nextInt();

    System.out.println("Enter the operation means do you want to replace position");
    int oper=sc.nextInt();

       if (oper==1)
       {
        int bitMask=1<<pos;
         
        int newNumber=bitMask | num ;

          System.out.println("after the togling th bit of number  the number will become"+newNumber);

       }



    //  a program to toggle a bit a position = “pos” in a number “n”.
      //











     
}
}
