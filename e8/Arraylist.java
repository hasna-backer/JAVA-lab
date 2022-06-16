/*1. Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.*/


import java.util.*;

class Arraylist
{
	public static void main(String args[]) 
	{
		Scanner in=new Scanner(System.in);
		ArrayList <String> al = new ArrayList <String> (); // Create an array list.
		System.out.println("\nArray Operations");
		
		
		while(true)
		{
			System.out.println("\n1.Add\n2.Remove\n3.Size\n4.Display\n5.Clear\n6.Exit");  //for menu driven
			System.out.print("Enter Your choice:  ");
			int c=in.nextInt();
			switch(c)
			{
				case 1: System.out.print("Enter item to add: ");  //to add an item
					String s1=in.next();
					al.add(s1);
					break;

				case 2: System.out.print("Enter item to remove: "); // to remove a specific item given
					String s2=in.next();					
			 		al.remove(s2);										
					break;

				case 3: System.out.println("\nSize of arraylist: " + al.size());  //to display the size of arraylist
					break;

				case 4: System.out.println("\nAll items in array list : " + al);   //to display all items in arraylist
					break;
				
				case 5: al.clear();
					System.out.println("\nAll item removed");  // to remove all items from array list
					break;
				 
				case 6: System.out.println("Exiting.....");
					System.exit(0);
					
					
      				default:System.out.println("Invalid choice");
			}
		}
	}
}
				

/*
OUTPUT
Array Operations
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  1
Enter item to add: java
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  1
Enter item to add: python
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  1
Enter item to add: c
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  4
All items in array list : [java, python, c]
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  2
Enter item to remove: c
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  4
All items in array list : [java, python]
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  3
Size of arraylist: 2
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  5
All item removed
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  4
All items in array list : []
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  7
Invalid choice
1.Add
2.Remove
3.Size
4.Display
5.Clear
6.Exit
Enter Your choice:  6
Exiting.....

