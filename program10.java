import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class program10
{
  public static void main(String args[]) throws java.lang.Exception
  {
   int Number, Count=0;
   Scanner sc=new Scanner(System.in);
   sc = new Scanner(System.in);		
   Number = sc.nextInt();
   while(Number > 0) 
   {
	Number = Number / 10;
	Count = Count + 1; 
    }
    System.out.println(Count);
 }
}
