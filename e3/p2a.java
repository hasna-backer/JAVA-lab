//linear search
import java.util.*;
class p2a{
     public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int i,k=0;
           
            System.out.print("Enter Number of elements: ");
            int n=sc.nextInt();
            int arr[]=new int[n];//declaring array
            System.out.print("\nEnter the elements: ");
            for( i=0;i<n;i++)
            {
              arr[i]=sc.nextInt();//reading values
            }
            System.out.print("\nEnter the element to search: ");
            int a=sc.nextInt();

             

             for( i=0;i<n;i++)
             {
               if(a==arr[i])//comparing
               {
                System.out.print("\nitem found at "+(i+1) + " position");
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
case 1
Enter Number of elements: 3

Enter the elements: 6
1
2

Enter the element to search: 7

element not found....  

case 2
Enter Number of elements: 4

Enter the elements: 1
8
2
5

Enter the element to search: 2

item found at 3 position

*/



