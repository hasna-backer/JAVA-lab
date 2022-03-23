/*Write a Java program to find the number of days in a month for a given year.
Check Leap year also.*/
import java.util.Scanner;
class Year
{
	public static void main(String args[])
	{	
		System.out.println("enter year");
		Scanner input=new Scanner(System.in);//object of the Scanner class  
		int y=input.nextInt();
		System.out.println("enter month");
		String m=input.next();
		int f=0;
		
		if(((y%4==0) && (y%100!=0)) || (y%400==0))//CHECKING LEAP YEAR OR NOT
		{
			System.out.println("entered year is leap year");
			 f=1;
		}
		else
		{
			System.out.println("entered year is not a leap year");
			 	
		}
	
		switch(m)//FOR DISPLAYING DAYS IN THE GIVEN MONTH
		{
			case "january" : System.out.println("entered month has 31 days");
					break;
			case "february" : if(f==1)
					{
					System.out.println("entered month has 29 days");
					}
					else
					{
					 System.out.println("entered month has 28 days");
					}
					break;
			case "march" : System.out.println("entered month has 31 days");
					break;
			case "april" : System.out.println("entered month has 30 days");
					break;
			case "may" : System.out.println("entered month has 31 days");
					break;
			case "june" : System.out.println("entered month has 30 days");
					break;
			case "july" : System.out.println("entered month has 31 days");
					break;
			case "august" : System.out.println("entered month has 31 days");
					break;
			case "september" : System.out.println("entered month has 30 days");
					break;
			case "october" : System.out.println("entered month has 31 days");
					break;
			case "november" : System.out.println("entered month has 30 days");
					break;
			case "december" : System.out.println("entered month has 31 days");
					break;
		}
	}
}



/*OUTPUT
#1
enter year
1999
enter month
february
entered year is not a leap year
entered month has 28 days


#2
enter year
2020
enter month
february
entered month has 29 days
entered year is leap year

#3
enter year
2345
enter month
may
entered month has 31 days
entered year is not a leap year

