//4. Program to demonstrate the creation of queue object using the PriorityQueue class


import java.util.*;

public class PriorityQ
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		PriorityQueue<String> queue=new PriorityQueue<String>();  //creating priorityQ
		
		System.out.print("Enter the number of elements to be inserted: ");
		int n=in.nextInt();
		System.out.println("Enter item to add: ");  

		for(int i=0;i<n;i++)
		{			 
			String s1=in.next();
			queue.add(s1);			
		}		
		/*System.out.println("Elements in priority queue:" + queue);*/

		System.out.println("\nIterating the queue elements:"); //iterating
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());

		}



	}
}


/*
OUTPUT
Enter the number of elements to be inserted: 5
Enter item to add: 
java
python
php
c
dbms
Iterating the queue elements:
c
dbms
php
python
java
*/
