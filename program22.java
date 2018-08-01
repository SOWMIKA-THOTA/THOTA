import java.util.*;
import java.lang.*;
import java.io.*;
class program22
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m+1;i<n;i++)
		{
			if(i%2==0)
			{  
			  
			}
			else if(i<n-1)
			{ 
			  System.out.print(i+" ");
			}
			else
			  System.out.print(i);
			}
		}
}
