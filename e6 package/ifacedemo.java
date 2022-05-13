/*2. Create an interface having prototypes of
functions area() and perimeter(). Create two
classes Circle and Rectangle which implements
the above interface. Create a menu driven
program to find area and perimeter of objects.*/

import java.util.*;
interface AP{
public void input();
public void area ();
void perimeter();
}


class circle implements AP{
int r=0;
double pi=3.14;
double area=0;
double peri=0;
Scanner sc=new Scanner(System.in);

 public void input(){
 System.out.println("Enter radius of circle");
 r=sc.nextInt();
 }
 
 public void area(){
 area=pi*r*r;
 System.out.println("area of circle is:"+area);
 }
 
public void perimeter(){
 peri=pi*2*r;
 System.out.println("perimeter of circle is:"+peri);
 }
 }
 
 
 
class rectangle implements AP{
int l=0;
int b=0;
double area=0;
double peri=0;
Scanner sc=new Scanner(System.in);

 public void input(){
 System.out.println("Enter length and breadth of rectangle");
 l=sc.nextInt();
 b=sc.nextInt();
 }
 
 public void area(){
 area=l*b;
 System.out.println("area of rectangle is:"+area);
 }
 
public void perimeter(){
 peri=2*(l+b);
 System.out.println("perimeter of rectangle is:"+peri);
 }
 }
 
class ifacedemo{
public static void main(String args[]){

    int ch;
   Scanner s=new Scanner(System.in);
   while(true){
   
    System.out.println("\n\n1.RECTANGLE\n2.CIRCLE\n3QUIT\nEnter choice:");
    ch=s.nextInt();
    //create objects
    rectangle obj1=new rectangle();
    circle obj2=new circle();
    
   switch(ch){
    
    case 1: 
      obj1.input();
      obj1.area();
      obj1.perimeter();
      break;
      
    case 2:
     
      obj2.input();
      obj2.area();
      obj2.perimeter();
      break;
      
    case 3:
     	  System.out.print("exiting..");
     	  System.exit(0);
     	  
     default:System.out.println("INVALID OPTION.....");
    
    }
    }
    }
    }
    
    
/*OUTPUT

1.RECTANGLE
2.CIRCLE
3QUIT
Enter choice:
1
Enter length and breadth of rectangle
2
4
area of rectangle is:8.0
perimeter of rectangle is:12.0


1.RECTANGLE
2.CIRCLE
3QUIT
Enter choice:
2
Enter radius of circle
5
area of circle is:78.5
perimeter of circle is:31.400000000000002


1.RECTANGLE
2.CIRCLE
3QUIT
Enter choice:
3
exiting..*/
  
