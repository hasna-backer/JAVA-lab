//3. Program to remove an object from the Stack when the position is passed as parameter



import java.util.*;
class Stacks
{

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Stack<String> stack=new Stack<String>();


		System.out.print("Enter the number of elements to be inserted:\n");
		int n=in.nextInt();
		System.out.println("Enter item to add:\n");           

		for(int i=0;i<n;i++)
		{
			 
			String s1=in.next();
			stack.push(s1);
			
		}
		System.out.println("\nStack="+stack);
		
		System.out.print("\nEnter the position of item to be removed from stack : ");
		int r=in.nextInt();
		stack.removeElementAt(r);

		System.out.println("\nDisplay Stack after removal of elements at position " +r+ ":\n " );

                Iterator<String> itr=stack.iterator();
 		while(itr.hasNext())
		{

			System.out.println(itr.next());
		}
	}

}


/*
OUTPUT
Enter the number of elements to be inserted:
5
Enter item to add:
java
python
php
c
dbms
Stack=[java, python, php, c, dbms]
Enter the position of item to be removed from stack : 3
Display Stack after removal of elements at position 3:
 
java
python
php
dbms
*/

