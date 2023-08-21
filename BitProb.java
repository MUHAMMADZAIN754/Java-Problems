

import java.util.Scanner;
class BitProb {


public static boolean isPowerof(int number)
{
 //Scanner sc=new Scanner(System.in);
     
  //    System.out.println("Enter the number which you want too check wther it is power of 2 or not  ");
  // int num=sc.nextInt();

   if (number<=0)
   {
    return false;
   }
   else if ((number & (number-1))==0)
   {
   
   return true;
   }
   return  false;
   }
public static void main(String[]args)
//Now lets break the broblem and code  
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want to check if it's a power of 2 or not: ");
    int num = sc.nextInt();

boolean result=isPowerof(num);
       
System.out.println(num + " is a power of 2: " + result);

//Problem Description I have solved the problem but i have felt some logic building issue in this problem
    
}
}