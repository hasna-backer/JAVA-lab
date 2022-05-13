package Arithmetic;
import java.util.*;
interface op{
  public void fucn(int a,int b);
}

public class add implements op{
 public void fucn(int a,int b){
    System.out.println("SUM OF NUMBERS : "+ (a+b));
  }

}
