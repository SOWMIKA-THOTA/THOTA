import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class program20
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        for(int i=1;i<=5;i++)
        {
        	res=n*i;
        	System.out.print(res+" ");
        }  
	}
}
