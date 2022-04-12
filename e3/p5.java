//5. Find the area of different shapes using overloaded functions
import java.util.*;
import java.lang.*;
class p5
{

//overloading area method
void area(int a,int b)
{
System.out.println("AREA OF RECTANGLE: "+(a*b)+"\n\n");
}
void area(int x)
{
System.out.println("AREA OF SQUARE: "+(x*x)+"\n\n");
}

void area(float r,int i,int j)
{
System.out.println("AREA OF CIRCLE: "+(3.14*r*r)+"\n\n");
}
 public static void main(String args[]){
            Scanner s=new Scanner(System.in);//CREATING SCANNER CLASS OBJECT
            p5 obj=new p5();//creating object
            do{
           System.out.println("1.RECTANGLE\n2.SQUARE\n3.CIRCLE\n4 QUIT\n\nEnter your Choice:  ");
           int ch=s.nextInt();
           int a,b,c,d,radius;
           float ar;
        //for menu driven
          switch(ch)
          {
           case 1:System.out.println("Enter length and breadth: ");
                  a=s.nextInt();
                   b=s.nextInt();
                   obj.area(a,b);//invoking area
                   break;

            case 2:System.out.println("Enter length : ");
                  c=s.nextInt();
                   
                   obj.area(c);//invoking area
                    break;

            case 3:System.out.println("Enter Radius : ");
                  radius=s.nextInt();
                   
                   obj.area(radius,0,0);//invoking area
                   break;
                   
            case 4: System.exit(0);    
                  
           default:System.out.println("INVALID INPUT.... ");
                     break;
           }
           }while(true);
           


}
}


/*
OUTPUT
1.RECTANGLE
2.SQUARE
3.CIRCLE
4 QUIT

Enter your Choice:  
1
Enter length and breadth: 
3
4
AREA OF RECTANGLE: 12


1.RECTANGLE
2.SQUARE
3.CIRCLE
4 QUIT

Enter your Choice:  
2
Enter length : 
4
AREA OF SQUARE: 16


1.RECTANGLE
2.SQUARE
3.CIRCLE
4 QUIT

Enter your Choice:  
3
Enter Radius : 
6
AREA OF CIRCLE: 113.03999999999999


1.RECTANGLE
2.SQUARE
3.CIRCLE
4 QUIT

Enter your Choice:  
4

*/



