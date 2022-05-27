/*4. Define 2 classes; one for generating Fibonacci
numbers and other for displaying even numbers in a
given range. Implement using threads. (Runnable
Interface)*/
import java.util.*;

class sample1 implements Runnable//implementing runnable interface
{

        Scanner s=new Scanner(System.in);
      int n;
       sample1(int k){//constructor
          n=k;  
         }
     public void run()
     {

                       
             
              System.out.println("\n__Fibonacci series upto "+n+" terms___\n\n");           
             int a=0,b=1,c=0;
         
             for(int i=1;i<=n;i++)
             {
                  
                System.out.println("Fibonacci : "+c);
               
               a=b;
               b=c;
               c=a+b;
            }
         
                  

              
         
    }

       

}



class sample2 implements Runnable
{
    int n1,n2;
     sample2(int x,int y){
       n1=x;
       n2=y; 
      
                
     }
        
     public void run()
     {

                       
                         
             
             for(int i=n1;i<=n2;i++)
             {
                  
                if(i%2==0){System.out.println("Even Number : "+i);}
            }   




          }

     


}


class runnable
{
    public static void main(String args[])
    {

                   Scanner s=new Scanner(System.in);
             System.out.println("\n\nEnter Limt for fibonacci series:");
             int n=s.nextInt();
             // Scanner s=new Scanner(System.in);
            
             System.out.println("\n\nEnter range for even numbers:");
             int n1=s.nextInt();
              int n2=s.nextInt();   
           
                   sample1 th1=new sample1(n);//creating object of class sample1
                   Thread t1=new Thread(th1);//creating thread object with the abve class object
                  t1.start();//starting threa
                 
                 
              sample2 th2=new sample2(n1,n2);//creating object of class sample2
              
              Thread t2=new Thread(th2);//creating thread object with the abve class object
               t2.start();//starting thread
              
             
        
    }



}


/*OUTPUT
Enter Limt for fibonacci series:
10


Enter range for even numbers:
10
25

__Fibonacci series upto 10 terms___


Fibonacci : 0
Fibonacci : 1
Fibonacci : 1
Fibonacci : 2
Fibonacci : 3
Fibonacci : 5
Fibonacci : 8
Fibonacci : 13
Fibonacci : 21
Fibonacci : 34
Even Number : 10
Even Number : 12
Even Number : 14
Even Number : 16
Even Number : 18
Even Number : 20
Even Number : 22
Even Number : 24

