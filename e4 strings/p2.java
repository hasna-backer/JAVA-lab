import java.util.*;

public class p2a
{
    public static String[] stringarrsort(String[] words)
    {
        for(int i = 0; i < words.length - 1; i++)
        {
            for(int j = i+1; j < words.length; j++)
            {
                if(words[i].compareTo(words[j]) > 0)//words[j] is less than than words[i]
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }
    public static void main(String[] args)
    {
        String[] arr = {"kohli", "sachin", "Rohith", "dhoni", "aswin", "Jadeja", "pant",  "rahul"};
        String[] sortedarr;
        Scanner s=new Scanner(System.in);
        System.out.print( "1.DEFAULT SORT\n2.USER SORT\nEnter choice: ");
        int ch=s.nextInt();
       System.out.print("\n");
              System.out.print("\n____OUTPUT____\n\n");
       if(ch==2){
        sortedarr = stringarrsort(arr);
        for(int i = 0; i < sortedarr.length; i++)
            System.out.println(sortedarr[i] + " ");
         }
      else if(ch==1){
             Arrays.sort(arr);  
        System.out.println(Arrays.toString(arr));

          }
       else{
             System.out.println( " INVALID OPTION....");
           }
    }
}

