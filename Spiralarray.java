

//Print the spiral order matrix as output for a given matrix of numbers. 
 import java.util.Scanner;
public class Spiralarray {
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
 int row=5;
 int  col=5;
  
 //First of all we will take an array as input

 int [][]arr=new int[row
 ][col];
 
 //Taking elements as input in array;
 System.out.println("Enter the elements of the array");
 for (int i=0;i<row;i++)
 {
   for(int j=0; j<col;j++)
    {
       arr[i][j]=sc.nextInt();
     }

    }
 // now we will diplay  the array to check the elements position

 for (int m=0;m<row;m++)
 {
   for (int n=0; n<col;n++)
   {
     System.out.print(arr[m][n]+ " |");
   }
  System.out.println(" ");

 }
 
 int rowStart = 0;
 int rowEnd = row-1;
 int colStart = 0;
 int colEnd = col-1;

System.out.print("the spiral array is as");

 //while(rowStart <= rowEnd && colStart <= colEnd) {
    //1
    for(int frow=colStart; col<=colEnd; col++) {
        System.out.print(arr[rowStart][frow] + " ");
    }
    rowStart++;
    
    //step2 we will display the last col 
    for (int fcol=rowStart;fcol<=rowEnd;fcol++ )
    {
      System.out.println(arr[fcol][colEnd]);
    }
     colEnd--;


    // Now we will display the last row in oposite  position //}
    
     for (int lrow=colEnd ;lrow>colStart;lrow--)
     {
      System.out.print(arr[rowEnd][lrow]);
     }
       rowEnd--;

     // now We will dipslay the first col

     for ( int fcol=rowEnd;fcol>=rowStart;fcol--)
     {
        System.out.println( arr[fcol][colStart]);
     }

     colStart++;


}


}
    

