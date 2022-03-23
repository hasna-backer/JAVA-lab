/*Write a Java program to read a floating-point number and if the number is zero
it prints "zero", otherwise, print "positive" or "negative". Add "small" if the
absolute value of the number is less than 1, or "large" if it exceeds 1,00,000 */
import java.util.Scanner;
import java.lang.Math;
class Float
{
	public static void main(String args[])
	{	
		System.out.println("enter a float value");
		Scanner input=new Scanner(System.in);//object of the Scanner class  
		float f=input.nextFloat();//READING FLOAT VALUE
		if(f==0)
		{	
			System.out.println("entered value is 0");
		}
		else if(f>0)
		{	
			
			if(f>100000)
			{
				System.out.println("large positive");
			}
			else if(f<1)
			{
				System.out.println("small positive");
			}
			else
			{
				System.out.println("positive");
			}
			
		}
		else
		{
			float n=Math.abs(f);
			if(n>100000)
			{
				System.out.println("large negative");
			}
			else if(n<1)
			{
				System.out.println("small negative");
			}
			else
			{
				System.out.println("negative");
			}
			
			
		}
		
	}
}
	
/*OUTPUT

#1
enter a float value
3.00
positive

#2
enter a float value
0.011
small positive

#3
enter a float value
-2.1
negtive

#4
enter a float value
-11111111
large negtive


		
