/*Write a program that accepts three numbers from the user and prints
"increasing" if the numbers are in increasing order, "decreasing" if the
numbers are in decreasing order, and "Neither increasing or decreasing order"
otherwise.*/
import java.util.Scanner;
class P4{
	public static void main(String args[]){	
	
	System.out.println("enter 3 numbers");
	//object of the Scanner class  
	Scanner input=new Scanner(System.in);
	//reading input from the user  
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	if(a>b && b>c)
	{
		System.out.println("numbers are in decreasing order");
	}
	else if(a<b && b<c)
	{
		System.out.println("numbers are in increasing order");
	}
	else
	{
		System.out.println("neither increasing nor decreasing");
	}
	}
	}
	
	
/*OUTPUT
#1
enter 3 numbers
1
2
3
numbers are in increasing order

#2
enter 3 numbers
3
2
1
numbers are in decreasing order

#3
enter 3 numbers
5
1
9
neither increasing nor decreasing

*/
	
