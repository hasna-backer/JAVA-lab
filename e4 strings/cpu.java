/*1. Create CPU with attribute price. Create inner class
Processor (no. of cores, manufacturer)and static nested class
RAM (memory, manufacturer). Create an object of CPU and
print information of Processor and RAM.*/


import java.util.*;
class cpu//OUTER CLASS
{

float price=10000;
     void display()
     {
       System.out.println("PRICE: "+price);
       processor p=new processor();//CREATING OBJECT FOR INNER CLASS PROCESSOR
       p.display();
     }


class processor//INNER CLASS
{
int core=6;
String man="AMD";
     void display()
     {
       System.out.println("NUMBER OF CORES: "+core);
       System.out.println("CPU MANUFACTERER: "+man);
     }

}

 static class ram//STATIC INNER CLASS
{
int size=8;
String manu="ACER";
    void display()
    {
     System.out.println("RAM SIZE: "+size+ " GB");
     System.out.println("RAM MANUFACTERER: "+manu);
    }
}


public static void main(String args[])
{
cpu obj=new cpu();//CREATING OBJECT OF OUTER CLASS
System.out.println("SYSTEM INFORMATIONS\n");
obj.display();
cpu.ram obj2=new cpu.ram();//CREATING OBJECT FOR STATIC INNER CLASS
obj2.display();
}


/*
OUTPUT

SYSTEM INFORMATIONS

PRICE: 10000.0
NUMBER OF CORES: 6
CPU MANUFACTERER: AMD
RAM SIZE: 8 GB
RAM MANUFACTERER: ACER


*/

















}
