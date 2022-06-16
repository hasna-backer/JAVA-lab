//7. Write a Java program to compare two hash set

import java.util.*;


class Comphashset
{

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		HashSet<String> set1=new HashSet<String>();    //Creating HashSet1 and adding elements

		System.out.print("Enter the number of elements to be inserted in set1: ");
		int n1=in.nextInt();
		System.out.println("Enter item to add: ");  

		for(int i=0;i<n1;i++)
		{			 
			String s1=in.next();
			set1.add(s1);			
		}

		HashSet<String> set2=new HashSet<String>();    //Creating HashSet2 and adding elements

		System.out.print("Enter the number of elements to be inserted in set2: ");
		int n2=in.nextInt();
		System.out.println("Enter item to add: ");  

		for(int i=0;i<n2;i++)
		{			 
			String s2=in.next();
			set2.add(s2);			
		}
		
		if (Objects.equals(set1, set2))
		System.out.println("Two hash set are equal");
		else
		System.out.println("Two hash sets are not equal");

	}
}

/*
OUTPUT
case 1:
Enter the number of elements to be inserted in set1: 3
Enter item to add: 
java
python
c
Enter the number of elements to be inserted in set2: 3
Enter item to add: 
c
python
java
Two hash set are equal
--------------
case 2:
Enter the number of elements to be inserted in set1: 3
Enter item to add: 
java
c
python
Enter the number of elements to be inserted in set2: 3
Enter item to add: 
shell
java
c
Two hash sets are not equal
-----------------
case 3:
Enter the number of elements to be inserted in set1: 4
Enter item to add: 
java
c
dbms
python
Enter the number of elements to be inserted in set2: 3
Enter item to add: 
c
dbms
java
Two hash sets are not equal
*/
