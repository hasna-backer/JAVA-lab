//binary search using  Arrays.biSearch()
import java.util.*;//util.Arrays
class p2d{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int i,k=0;
            
            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];//declaring array
             System.out.print("Enter the elements in sorted order: ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();//reading values
            }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();

           int z=Arrays.binarySearch(arr,a);//invoking binarySearch()
           if(z> -1)//implies element found case
            System.out.println("The Element Found at Index:  "+z);
          else//not found case
             System.out.println("The Element Not Found   ");            



}
}


/*
OUTPUT
case 1
-------
Enter Number of elements: 3
Enter the elements in sorted order: 1
2
3
Enter the element to search: 4
The Element Not Found   
ksb@ksb-OptiPlex-3060:~/hasna/java/E3$ java p2d
------------------------------------------------------------------------------------

case 2
------
Enter Number of elements: 4
Enter the elements in sorted order: 12
23
34
45
Enter the element to search: 45
The Element Found at Index:  3

