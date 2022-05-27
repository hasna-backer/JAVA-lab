/*2. Find the average of N positive integers, raising a user
defined exception for each negative input.*/
import java.util.*;
class myException extends Exception{
	public myException(String s){
		super(s);
	}

}

class avgnum{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items:");
		int n=sc.nextInt();
		
		
		int d;
		int total=0;
		int c=0;
		System.out.println("Enter numbers");		
		for(int i=0;i<n;i++){
			d = sc.nextInt();
			try{
				if(d>=0){
					c++;
					total=total+d;
				}
				else{
					throw new myException("negative numbers are not allowed!!! \nplease enter another number ");
				}
			
			}
			catch(myException ex){
				System.out.println(ex.getMessage()+"\n");
			
			}
			
			if(d<0)
			i--;
		
		}
		System.out.println("Average of "+n+" positive numbers="+(double)total/n);
	
	
	}


} 
/*
OUTPUT

Enter the number of items:
5
Enter numbers
3
-5
negative numbers are not allowed!!! 
please enter another number 

2
56
4
-9
negative numbers are not allowed!!! 
please enter another number 

6
Average of 5 positive numbers=14.2


*/
