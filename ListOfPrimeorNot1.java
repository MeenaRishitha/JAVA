import java.io.*;
public class Main {
  public static void main(String[] args) {
    int low = 23,high = 97;
    System.out.println("Enter a list prime or not");
    for(int i=low;i<=high;i++)
    {
        boolean flag = false;
        for (int j = 2; j <= i / 2; ++i) 
        {
           if(i%j==0)   
           {
             flag = true;
             break;
           }
        } 
     if (!flag)
      System.out.println(i + " is a prime number.");
    else
      System.out.println(i + " is not a prime number.");
    }
  }
}
   
