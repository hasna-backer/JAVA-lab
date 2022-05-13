package Arithmetic;
import java.util.*;
interface op{
  public void fucn(int a,int b);
}

public class sub implements op{
 public void fucn(int a,int b){
    System.out.println("DIFFERENCE OF NUMBERS : "+ (a-b));
  }

}
