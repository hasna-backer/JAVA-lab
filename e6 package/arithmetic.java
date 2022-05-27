import java.util.*;
import Arithmetic.*;//importing arithmetic package
class arithmetic
{
  public static void main(String args[])
  {
    int a,b,c,x,y,r;
    Scanner s=new Scanner(System.in);
   while(true){
    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.EXIT\n\nEnter choice : ");
    int ch=s.nextInt();
     
    switch(ch)
    {
       case 1:System.out.println("Enter 2 Numbers for operation:");
              a=s.nextInt();
              b=s.nextInt();
              add obj1=new add();//creating object of class in package
               obj1.fucn(a,b);
              break;
       case 2:System.out.println("Enter 2 Numbers for operation:");
              a=s.nextInt();
              b=s.nextInt();
               sub obj2=new sub();
 
              obj2.fucn(a,b);
              break;
       case 3:System.out.println("Enter 2 Numbers for operation:");
              a=s.nextInt();
              b=s.nextInt();
              mul obj3=new mul();
              obj3.fucn(a,b);
              break;
       case 4:System.out.println("Enter 2 Numbers for operation:");
              a=s.nextInt();
              b=s.nextInt();
               if(b==0){System.out.println("Division not possible...");}
               else{div obj4=new div();
              obj4.fucn(a,b);}
              break;
       case 5:System.out.println("EXITING... ");
              System.exit(0);
       default:System.out.println("INVALID OPTION...");
    } 
   }

  } 

}






/*OUTPUT

1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 
1
Enter 2 Numbers for operation:
1
3
SUM OF NUMBERS : 4


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 
3
Enter 2 Numbers for operation:
3
4
PRODUCT OF NUMBERS : 12


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 
4
Enter 2 Numbers for operation:
5
5
QUOTIENT OF NUMBERS : 1


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 
2
Enter 2 Numbers for operation:
1
9
DIFFERENCE OF NUMBERS : -8


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter choice : 
5
EXITING... 

*/
