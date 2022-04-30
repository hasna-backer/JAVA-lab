//PROGRAM FOR INNER CLASS CONCEPT
import java.util.*;

class p1//OUTER CLASS
{

float price=5000;
     void display()
     {
       System.out.println("PRICE: "+price);
       processor p=new processor();//CREATING OBJECT FOR INNER CLASS PROCESSOR
       p.display();
     }


class processor//INNER CLASS
{
int core=5;
String man="AMD";
     void display()
     {
       System.out.println("NUMBER OF CORES: "+core);
       System.out.println("CPU MANUFACTERER: "+man);
     }

}

 static class ram//STATIC INNER CLASS
{
int size=4;
String manu="DELL";
    void display()
    {
     System.out.println("RAM SIZE: "+size+ " GB");
     System.out.println("RAM MANUFACTERER: "+manu);
    }
}


public static void main(String args[])
{
p1 obj=new p1();//CREATING OBJECT OF OUTER CLASS
System.out.println("SYSTEM INFORMATIONS");
System.out.println("....................");
System.out.println("\n");
obj.display();
p1.ram obj2=new p1.ram();//CREATING OBJECT FOR STATIC INNER CLASS
obj2.display();
}


/*
SYSTEM INFORMATIONS
....................
PRICE: 5000.0
NUMBER OF CORES: 5
CPU MANUFACTERER: AMD
RAM SIZE: 4 GB
RAM MANUFACTERER: DELL
*/

















}
