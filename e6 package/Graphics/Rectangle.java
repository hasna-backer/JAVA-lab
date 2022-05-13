package Graphics;
import java.util.*;
interface figure{
  public void area(int a,int b);
}

public class Rectangle implements figure{
 public void area(int a,int b){
    System.out.println("AREA OF RECTANGLE : "+ (a*b));
  }

}

