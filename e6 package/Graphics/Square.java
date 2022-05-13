package Graphics;
import java.util.*;
interface figure{
  public void area(int a,int b);
}



public class Square implements figure{
 public void area(int a,int b){
    System.out.println("AREA OF SQUARE : "+  (a*a));
  }

}

