//5. Program to demonstrate the addition and deletion of elements in deque



import java.util.*;
public class Deque5
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		Deque<String> deque = new ArrayDeque<String>();		//Creating Deque  


  
		System.out.print("Enter the number of elements to be inserted: ");	//adding elements
		int n=in.nextInt();
		System.out.println("Enter item to add: ");  
		for(int i=0;i<n;i++)
		{			 
			String s1=in.next();
			deque.add(s1);			
		}
		System.out.println("\nElements in Deque:");
		/*Iterator<String> itr=deque.iterator();     //iterating elements
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		for (String str : deque) 
		{
			System.out.println(str);
		}



		deque.poll();			//delete elements from deque
		System.out.println("\nElements after deletion:");
		/*Iterator<String> iter=deque.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}*/
		for (String str : deque) 
		{
			System.out.println(str);
		}
		
		

	} 
}

/*
OUTPUT
Enter the number of elements to be inserted: 5
Enter item to add: 
java
php
shell
c
dbms
Elements in Deque:
java
php
shell
c
dbms
Elements after deletion:
php
shell
c
dbms
*/

