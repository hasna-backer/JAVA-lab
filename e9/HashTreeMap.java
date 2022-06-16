//2. Program to Convert HashMap to TreeMap

import java.util.*;

class HashTreeMap
{
    	public static void main(String args[]) 
    	{
        	Map<Integer, String> map = new HashMap<>();
        	map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "C");
		map.put(4, "Python");
        	System.out.println("HashMap : " + map);
        	Map<Integer, String> treeMap = new TreeMap<>();
        	treeMap.putAll(map);
        	System.out.println("TreeMap : " + treeMap);
    	}
}


/*
OUTPUT
HashMap : {1=Java, 2=Python, 3=C, 4=Python}
TreeMap : {1=Java, 2=Python, 3=C, 4=Python}
*/
