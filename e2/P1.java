/*Read 2 matrices from the console and perform matrix
addition.*/

import java.util.Scanner;
class P1
{
public static void main(String args[])
	{
	int i,j,r,cl;
	Scanner sc=new Scanner(System.in);//object of the Scanner class 
	System.out.println("enter number of rows and columns");
	r=sc.nextInt();
	cl=sc.nextInt();
	int a[][]=new int[10][10];
	int b[][]=new int[10][10];
	int c[][]=new int[10][10];
	System.out.println("enter elements to first matrix");//READING ELEMENTS
	for(i=0;i<r;i++)
	{
		for(j=0;j<cl;j++)
		{
		a[i][j]=sc.nextInt();
		}
	}
	
	
	System.out.println("enter elements to second matrix");//READING ELEMENTS
	for(i=0;i<r;i++)
	{
		for(j=0;j<cl;j++)
		{
		b[i][j]=sc.nextInt();
		}
	}
	
	
	for(i=0;i<r;i++)//FOR ADDING 2 MATRIX
	{
		for(j=0;j<cl;j++)
		{
		c[i][j]=a[i][j]+b[i][j];
		}
	}
	
	
	System.out.println("sum of 2 matrices is");//PRINTING THE SUM MATRIX
	for(i=0;i<r;i++)
	{
		for(j=0;j<cl;j++)
		{
		System.out.print(c[i][j]+"\t ");
		}
		System.out.println("\n");
	}
}
}



/*OUTPUT
enter number of rows and columns
2
2
enter elements to first matrix
1
2
3
4
enter elements to second matrix
1
2
3
4
sum of 2 matrices is
2	 4	 

6	 8
*/		
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
