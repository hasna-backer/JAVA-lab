
//2. Program to remove all the elements from a linked list

import java.util.*;
class Linkedlist
{
	public static void main(String args[]) 
	{
		Scanner in=new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();	// Create a linked list.
		System.out.print("Enter the number of elements to be inserted: ");
		int n=in.nextInt();
		System.out.println("Enter item to add: ");           //to add an item

		for(int i=0;i<n;i++)
		{
			  
			String s1=in.next();
			list.add(s1);
			
		}

		System.out.println("\nDisplay the linked List :" + list);

		list.clear();        //remove all items from linked list
		

		System.out.println("\nLinked list after removing all elements: " + list);   
					
	}
}


/*
Enter the number of elements to be inserted: 4
Enter item to add: 
java
python
php
c
Display the linked List :[java, python, php, c]
Linked list after removing all elements: []
*/
