/*
2. Write a menu driven program that would choose either in-built
method or call a user defined method to sort an array of strings.
*/
import java.util.*;
import java.lang.*;

class method{
void user(String a[],int n){
//comparing strings and swapping them
for(int i=0;i<n-1;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(a[i].compareTo(a[j])>0)
		{
		String temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	}
}

//for printing array OR System.out.println(Arrays.toString(a));  
System.out.println("sorted array is");
for(int i=0;i<n;i++)
System.out.print(a[i]+"\n");
}
}



class array{
public static void main(String args[]){
Scanner in=new Scanner(System.in);


//reading size of array
System.out.println("enter size of array: ");
int n=in.nextInt();
String a[]=new String[n];
//reading strings from user
System.out.println("enter strings to array: ");
for(int i=0;i<n;i++)
{
a[i]=in.next();
}
method obj=new method();



do{
System.out.print( "\nchoose method to sort an array of strings\n1.DEFAULT SORT\n2.USER SORT\n3.QUIT\n");
int ch=in.nextInt();
switch (ch){
case 1:Arrays.sort(a);  
        System.out.println(Arrays.toString(a));

	break;
case 2:obj.user(a,n);
	break;
case 3:System.exit(0);
default :System.out.print("invalid input");


}
}while(true);
}
}




/*OUTPUT
enter size of array: 
4
enter strings to array: 
hasna
ashik
amrtha
shamna

choose method to sort an array of strings
1.DEFAULT SORT
2.USER SORT
3.QUIT
1
[amrtha, ashik, hasna, shamna]

choose method to sort an array of strings
1.DEFAULT SORT
2.USER SORT
3.QUIT
2
sorted array is
amrtha
ashik
hasna
shamna

choose method to sort an array of strings
1.DEFAULT SORT
2.USER SORT
3.QUIT
3

*/
