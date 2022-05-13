package Arithmetic;
import java.util.*;
interface op{
  public void fucn(int a,int b);
}

public class div implements op{
 public void fucn(int a,int b){
    System.out.println("QUOTIENT OF NUMBERS : "+ (a/b));
  }

}
