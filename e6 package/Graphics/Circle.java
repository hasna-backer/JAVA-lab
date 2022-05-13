package Graphics;
import java.util.*;
interface figure{
  public void area(int a);
}


public class Circle implements figure{
 public void area(int a){
    System.out.println("AREA OF CIRCLE : "+  (a*a*3.14));
  }

}

