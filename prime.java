import java.io.*;
import java.util.Scanner;
class Prime
{
public static void main (String[] args) 
	{
	 int i;
	 int j=2;
	 int sh=0;
	 Scanner ns=new Scanner (System.in);
	 System.out.println("Enter the number");
	 i=ns.nextInt();
	 while(j<=i/2)
	{
		if(i%j==0)
	{
		System.out.println("No");
			sh=1;
			break;
		}
		else
		{
			System.out.println("Yes");
			i++;
			sh=0;
		}
	}
	}
}
