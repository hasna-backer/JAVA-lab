//simple binary search

import java.util.*;
class p2b{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int i;
            
            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];//declaring array
               int k=0;
             System.out.print("\nEnter the elements in sorted order: ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();//reading values
            }
             System.out.print("\nEnter the element to search: ");
             int a=s.nextInt();

             

             int first=0,last=n-1,mid=(first+last)/2;
            while(first<=last)
             {
              if(a>arr[mid])//case of element is right of mid
               {
                 first=mid+1;
                 mid=(first+last)/2;
                }
               else if(a<arr[mid])//case of element is left of mid
              {
                 last=mid-1;
                 mid=(first+last)/2;
                 
               }
             else//arr[mid] == a
              {
               System.out.print("\nelement found at "+mid);
              k=1;
                break;
                
               }


             }
             if(k==0)
             {
               System.out.print("\nelement not found....  ");
              }
             
}
}


/*
OUTPUT
#1
Enter Number of elements: 4

Enter the elements in sorted order: 1
3
5
7

Enter the element to search: 5

element found at 2


#2
Enter Number of elements: 3

Enter the elements in sorted order: 1
3
5

Enter the element to search: 7

 
element not found....  ksb@ksb-OptiPlex-3060:~/hasna/java/e3$ 


