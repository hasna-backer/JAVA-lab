/*Create a class ‘Employee’ with data members Empid,Name, Salary, Address and constructors to initialize thedata members.
Create another class ‘Teacher’ that inheritthe properties of class employee and contain its own data members department, 
Subjects taught and constructors to initialize these data members and also include display function to display all the data members. Use array of
objects to display details of N teachers.
*/

import java.util.*;

class employee{
int emp_id;
String name;
float salary;
String address;
employee(int emp,String n,float sal,String addr)
{
emp_id=emp;
 name=n;
 salary=sal;
 address=addr;
 }
 
 employee()
 {
 }
 }
 
 
class teacher extends employee{
String dept,subject;
teacher(int emp,String n,float sal,String addr,String dep,String sub)
{
emp_id=emp;
 name=n;
 salary=sal;
 address=addr;
 dept=dep;
 subject=sub;
 }
 
 
 void display(int i)
{

System.out.println("\ndetails of teacher no:"+(i+1));
System.out.println("employee id:"+emp_id);
System.out.println("employee name:"+name);
System.out.println("employee salary:"+salary);
System.out.println("employee address:"+address);
System.out.println("employee department:"+dept);
System.out.println("employee subject:"+subject);
}
}

class p1{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,emp;
String name,addr,dept,sub;
float sal;
System.out.print("enter number of teachers: ");
int n=in.nextInt();
teacher obj[]=new teacher[n];
for(i=0;i<n;i++)
{
System.out.println("\n\nEnter details of teacher no:"+(i+1));
System.out.print("Enter employee id:");
emp=in.nextInt();
System.out.print("Enter employee name:");
name=in.next();
System.out.print("Enter employee salary:");
sal=in.nextFloat();
System.out.print("Enter employee address:");
addr=in.next();
System.out.print("Enter employee department:");
dept=in.next();
System.out.print("Enter employee subject:");
sub=in.next();
obj[i]=new teacher(emp,name,sal,addr,dept,sub);
}
System.out.println("\n\nTEACHER DETAILS");
for(i=0;i<n;i++)
{
obj[i].display(i);
}
}
}

/*OUTPUT

enter number of teachers: 2


Enter details of teacher no:1
Enter employee id:111
Enter employee name:hasna
Enter employee salary:100000
Enter employee address:home
Enter employee department:maths
Enter employee subject:maths


Enter details of teacher no:2
Enter employee id:222
Enter employee name:scissna
Enter employee salary:120000
Enter employee address:dream
Enter employee department:physics
Enter employee subject:cs

TEACHER DETAILS

details of teacher no:1
employee id:111
employee name:hasna
employee salary:100000.0
employee address:home
employee department:maths
employee subject:maths


details of teacher no:2
employee id:222
employee name:scissna
employee salary:120000.0
employee address:dream
employee department:physics
employee subject:cs

*/




