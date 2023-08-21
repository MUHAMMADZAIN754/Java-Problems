

import java.util.Scanner;
public class Bitman{

public static void main(String[]args)
{

    Scanner sc=new Scanner(System.in);

System.out.println("Now I am studying the bit manipulation");

System.out.println("Enter the operation");

System.out.println("enter the operation");
int operation=sc.nextInt();

//oper is 1  ; set oper
//oper is 0 ;clear oper

int n=5;

if (operation==1)
{

int poss=1;
int bitMask=1<<poss;

int newNumber =bitMask | n;

System.out.println("After updating the bit at location 1 to 1 in the 0101 will  be  "+newNumber);
}
else
{

int poss=2;

int bitMask=1<<poss;

 int notBitMask=~(bitMask);
 
int newNumber =notBitMask & n;

System.out.println("After updating the bit at location 2  to 0 in the 0101 will  be "+newNumber);

}
}

}