package Graphics;
import java.util.*;
interface figure{
  public void area(int a,int b);
}
 public class Triangle implements figure{
 public void area(int a,int b){
    System.out.println("AREA OF TRIANGLE : "+  (a*b*0.5));
  }

}
