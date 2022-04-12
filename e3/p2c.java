//recursive binary search
import java.util.*;

class p2c
{
int bisearch(int first,int last,int x,int arr[])//recursive fun
{

if(last>=first)
{
int mid=(first+last)/2;
if(arr[mid]==x)//case of match
return mid;

if(x>arr[mid])
return bisearch(mid+1,last,x,arr);//case of right side
return bisearch(first,mid-1,x,arr);//case of left side
}
return -1;
}
public static void main(String args[]){
           
           p2c obj=new p2c();
	   Scanner s=new Scanner(System.in);
            int i;
 	  System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];
               
             System.out.print("Enter the elements in sorted order : ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();
             }
             System.out.print("Enter the element to search: ");
             int key=s.nextInt();
           
           int k=obj.bisearch(0,n-1,key,arr);//invoking bisearch
          if(k==-1)
          System.out.print("ELEMENT NOT FOUND... ");
          else
            System.out.print("ELEMENT FOUND AT INDEX "+k);
           
           
}

}

/*

OUTPUT
case 1
Enter Number of elements: 5
Enter the elements in sorted order : 1
3
5
7
9
Enter the element to search: 7
ELEMENT FOUND AT INDEX 3ksb@ksb-OptiPlex-3060:~/hasna/java/E3$ java p2c


case 2
Enter Number of elements: 6
Enter the elements in sorted order : 1
2
3
4
5
6
Enter the element to search: 7
ELEMENT NOT FOUND... ksb@ksb-O
*/






