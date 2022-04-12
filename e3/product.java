//returning information of product with lowest price
import java.util.*;
class product
{
int pcode;
String pname;
int price;
     void setdata(int a,int b,String c)//to initialise values
      {
        pcode=a;
        pname=c;
        price=b;
       
      }

public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            
             int a1,a2,a3;
            int b1,b2,b3;
               String c1,c2,c3;
            product obj1=new product();//declaring  objects
            product obj2=new product();
            product obj3=new product();
      

            System.out.print("enter pcode,pname,price for first product \n");
             a1=s.nextInt();
              c1=s.next();
               b1=s.nextInt();
             obj1.setdata(a1,b1,c1);//invoking setdata

           
           System.out.println("\nenter pcode,pname,price for second product ");
             a2=s.nextInt();
              c2=s.next();
               b2=s.nextInt();
              obj2.setdata(a2,b2,c2);

          
           System.out.println("\nenter pcode,pname,price for third product ");
             a3=s.nextInt();
              c3=s.next();
               b3=s.nextInt();
             obj3.setdata(a3,b3,c3);
            
           
  
//finding small
if(obj1.price<obj2.price && obj1.price<obj3.price)  
  System.out.println(obj1.pname+" has lowest price"); 
if(obj2.price<obj1.price && obj2.price<obj3.price)  
  System.out.println(obj2.pname + " has lowest price"); 
if(obj3.price<obj1.price && obj3.price<obj2.price)  
  System.out.println(obj3.pname + " has lowest price"); 
             
}
}
/*OUTPUT
enter pcode,pname,price for first product 
12 milk 25

enter pcode,pname,price for second product 
13 pen 5

enter pcode,pname,price for third product 
14 sugar 40
pen has lowest price


*/


