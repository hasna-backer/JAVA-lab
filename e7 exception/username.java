/*1. Write a user defined exception class to authenticate
the user name and password.*/



import java.util.*;
class myException extends Exception{
	public myException(String s){
		super(s);	
	}
}

class username{
	public static void main(String ar[]){
		String username="hasna";
		String password="password";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username:");
		String u=sc.next();
		System.out.print("Enter Password:");
		String p=sc.next();
		try{
			if((u.equals(username)) && (p.equals(password))){
				throw new myException("Authentication success");
			}
			else{
				throw new myException("Authentication Faild...!");
				}
			}
		catch(myException ex){
					System.out.print(ex.getMessage()+"\n");
			}
	}

}

/*
OUTPUT

#case 1
Enter Username:hasna
Enter Password:password
Authentication success

#case 2
Enter Username:sharanya
Enter Password:sharanya
Authentication Faild...!

