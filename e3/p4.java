//sum of complex numbers
import java.util.*;
class p4
{
int r;
int i;

p4(int a,int b)//to initialise
{
r=a;
i=b;
}
public static void main(String arg[])
{
int c;
int d;
Scanner s=new Scanner(System.in);//CREATING SCANNER CLASS OBJECT



System.out.println("Enter Real and Imaginary Part of First Complex Number: ");
//reading first
int x=s.nextInt();
int y=s.nextInt();
p4 obj1=new p4(x,y);//passing
System.out.println("Enter Real and Imaginary Part of Second Complex Number: ");
//reading second
int p=s.nextInt();
int q=s.nextInt();
p4 obj2=new p4(p,q);//passing
c=obj1.r+obj2.r;//adding real part
d=obj1.i+obj2.i;//adding img part


System.out.println("SUM OF COMPLEX NUMBERS: "+c+"+i"+d);


}
}

/*
OUTPUT

Enter Real and Imaginary Part of First Complex Number: 
12 4
Enter Real and Imaginary Part of Second Complex Number: 
3 7
SUM OF COMPLEX NUMBERS: 15+i11

*/
