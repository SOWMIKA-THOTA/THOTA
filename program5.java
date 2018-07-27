import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class program5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a, b,c;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: \n");
        a= sc.nextInt();
        System.out.print("Enter the second number: \n");
         b=sc.nextInt();
        System.out.print("Enter the third number: \n");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Largest number is:"+a);
        }
        else if(b>c)
        {
            System.out.println("Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest number is:"+c);
        }
 
    }
}
