/*Write a program in Java to display the cube of the number up to a given
integer.*/

import java.util.Scanner;
class Cube
{
	public static void main(String args[])
	{	
		System.out.println("enter limit");
		//object of the Scanner class  
		Scanner input=new Scanner(System.in);
		//reading input from the user  
		int n=input.nextInt();
		System.out.println("cubes upto "+n);
		for(int i=1;i<=n;i++)
		{	
			int c=i*i*i;
			System.out.println(i+"^3 = "+c);
		}
	}
}



/*OUTPUT
enter limit
5
cubes upto 5
1^3 = 1
2^3 = 8
3^3 = 27
4^3 = 64
5^3 = 125

