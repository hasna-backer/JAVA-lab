import java.util.*;
import java.lang.*;
class p3
{
public static void main(String args[]){
// new string using new
char chs[]={'W','e','l','c','o','m','e'};
String newStr =new String(chs);
System.out.println("new string from char[] using new string: "+newStr);

byte asciis[] ={65,66,67,68,69,70};
newStr =new String(asciis);
System.out.println("new string from byte[] using new string: "+newStr+"\n");

String s1="good";
String s2="morning";
System.out.println("\nLENGTH");
//string length
System.out.println("string length of good:"+ s1.length()+"\n");

//to upopercase and lower case
System.out.println("CASE CONVERSION");
System.out.println(s1 +"to uppercase"+ s1.toUpperCase());
System.out.println(s1 +"to lowercase"+ s1.toLowerCase());

//string concatenation
System.out.println("\nSTRING CONVERSION");
System.out.println("using concat():"+s1.concat(s2));
System.out.println("using + operator:"+s1+s2);

//character extraction
System.out.println("\nCHARACTER EXTRACTION");
System.out.println("character at 3rd position:"+s1.charAt(3));

char c[] = new char[5];
s1.getChars(2,4,c,0);
System.out.println("character between 2 and 4 :"+ new String(c));

//character comparison
System.out.println("\nCHARACTER COMPARISON");
s1="welcome";
s2="WELCOME";
System.out.println(s1 + " compareTo " +s2+ ":" +s1.compareTo(s2));
System.out.println(s1 + " compareToIgnorecase " +s2 +":" +s1.compareToIgnoreCase(s2));

System.out.println(s1 + " starts With W:" +s1.startsWith("W"));
System.out.println(s1 + "ends With x:" +s1.endsWith("x"));


System.out.println("\nSEARCH SUBSTRING");
s1="Its me Hasna";
System.out.println("index of hasna"+s1 + s1.indexOf("Hasna"));
System.out.println("'Hasna' in " + s1 + " is replaced with 'Scissna': " +s1.replace("Hasna","Scisna") + "\n\n");


System.out.println("Using valueOf()" );
     float n=15.3f;
     System.out.println(n+" is converted to  " +String.valueOf(n) +"(string)");






}
}


/*OUTPUT
new string from char[] using new string: Welcome
new string from byte[] using new string: ABCDEF


LENGTH
string length of good:4

CASE CONVERSION
goodto uppercaseGOOD
goodto lowercasegood

STRING CONVERSION
using concat():goodmorning
using + operator:goodmorning

CHARACTER EXTRACTION
character at 3rd position:d
character between 2 and 4 :od

CHARACTER COMPARISON
welcome compareTo WELCOME:32
welcome compareToIgnorecase WELCOME:0
welcome starts With W:false
welcomeends With x:false

SEARCH SUBSTRING
index of hasnaIts me Hasna7
'Hasna' in Its me Hasna is replaced with 'Scissna': Its me Scisna

Using valueOf()
15.3 is converted to  15.3 (string)


ksb@ksb-OptiPlex-3060:~/hasna/java/e4$ */

