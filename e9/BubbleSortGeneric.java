// Using generic method perform Bubble sort.


import java.util.*;

public class BubbleSortGeneric<T extends Comparable<? super T>> 
{
  	T[] array;
  	BubbleSortGeneric(T[] array)
	{
    		this.array = array;
  	}
  
  	private T[] bubbleSort()
	{
    	for(int i = array.length; i > 1; i--)
	{
      		for(int j = 0; j < i - 1; j++)
		{        
        		if(array[j].compareTo(array[j+1]) > 0) //if greater swap elements
			{
          			swapElements(j, array);
        		}
      		}            
    	}
    	return array;
}

  	private void swapElements(int index, T[] arr)
	{
    		T temp = arr[index];
    		arr[index] = arr[index+1];
    		arr[index+1] = temp;        
  	}
  	public static void main(String[] args) 
	{

    		Integer[] intArr = {35,48,21,43,67,2,1};
    		BubbleSortGeneric<Integer> bsg1 = new BubbleSortGeneric<Integer>(intArr);
    		Integer[] sa1 = bsg1.bubbleSort();
    		System.out.println("Sorted array- " + Arrays.toString(sa1)); 
    
    		String[] strArr = {"java", "python", "c", "dbms"};
    		BubbleSortGeneric<String> bsg2 = new BubbleSortGeneric<>(strArr);
    		String[] sa2 = bsg2.bubbleSort();
    		System.out.println("Sorted array- " + Arrays.toString(sa2));
  	}
}



/*
OUTPUT
Sorted array- [1, 2, 21, 35, 43, 48, 67]
Sorted array- [c, dbms, java, python]
*/
