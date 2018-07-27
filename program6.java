import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class program6
{
  public static void main(String args[]) throws java.lang.Exception
  {
   Long year;
    Scanner input= new Scanner(System.in);
       year= input.nextLong();
        if(year%4==0)
        {
           System.out.println("yes");
        }
        else
        {
             System.out.println("no");
        }
  }
}
