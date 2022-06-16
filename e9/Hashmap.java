//1. Program to demonstrate the working of Map interface by adding, changing and removing elements.


import java.util.*;

class Hashmap 
{
	public static void main(String args[]) 
	{

		Scanner in=new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<Integer, String>();	// Create a hash map.

		// Put elements to the map
		
		hm.put(new Integer(1), "c");
		hm.put(new Integer(2), "python");
		hm.put(new Integer(3), "php");
		hm.put(new Integer(4), "dbms");
		hm.put(new Integer(5), "oop"); 
		System.out.println("The elements are : "+hm);

		//changing elements
		hm.put(new Integer(5), "java"); 
		System.out.println("oop changed to java : "+hm);

		//removing element
		hm.remove(new Integer(4));
		System.out.println("dbms Removed  : "+hm);

	}
}


/*OUTPUT
The elements are : {1=c, 2=python, 3=php, 4=dbms, 5=oop}
oop changed to java : {1=c, 2=python, 3=php, 4=dbms, 5=java}
dbms Removed  : {1=c, 2=python, 3=php, 5=java}
*/
