//6. Program to demonstrate the creation of Set object using the LinkedHashset class



import java.util.*;

class Linkedhashset
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		LinkedHashSet<String> set=new LinkedHashSet<String>();

		System.out.print("Enter the number of elements to be inserted: ");
		int n=in.nextInt();
		System.out.println("Enter item to add: ");  

		for(int i=0;i<n;i++)
		{			 
			String s1=in.next();
			set.add(s1);			
		}

		System.out.println("\nElements in LinkedHashset: ");
		Iterator<String> itr=set.iterator();
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
php
python
java
c
Elements in LinkedHashset: 
java
php
python
c
*/
