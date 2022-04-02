/*Read a matrix from the console and check whether it is
symmetric or not.*/

import java.util.Scanner;
class P2
{
public static void main(String args[])
	{
	int i,j,r,c,f=0;
	Scanner sc=new Scanner(System.in);//object of the Scanner class 
	System.out.println("enter number of rows ");
	r=sc.nextInt();
	int a[][]=new int[10][10];
	System.out.println("enter elements to first matrix");//READING ELEMENTS
	for(i=0;i<r;i++)
	{
		for(j=0;j<r;j++)
		{
		a[i][j]=sc.nextInt();
		}
	}
	
	
	
	for(i=0;i<r;i++)//check whether it is symmetric or not.
	{
		for(j=0;j<r;j++)
		{
		if(a[i][j]!=a[j][i])
		{
		f=1;
		}
		}
	}
	
	if(f==0)
	{
	System.out.println("symmetric matrix");
	}
	else
	{
	System.out.println("not a symmetric matrix");
	}
	
	}
}

