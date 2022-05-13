package Arithmetic;
import java.util.*;
interface op{
  public void fucn(int a,int b);
}

public class mul implements op{
 public void fucn(int a,int b){
    System.out.println("PRODUCT OF NUMBERS : "+ (a*b));
  }

}
