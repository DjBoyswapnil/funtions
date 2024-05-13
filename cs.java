package function;

import java.io.InputStream;
import java.util.Scanner;

class cs
{
	

	public int acpt()
	{
	int num1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	num1=sc.nextInt();
	return num1;
	}
	
	public int sum()
	{
	int n1=acpt();
	int n2=acpt();
	int sum1;
	sum1=n1+n2;
	System.out.println("the sum of number is="+sum1);
	return sum1;
	}
	public void rev_ord()
	{
	int s1=sum();
	int rev=0,rem;
	while(s1>0)
	{
	rem=s1%10;
	rev=(rev*10)+rem;
	s1=s1/10;
	}
	System.out.println("the reverse of sum is"+rev);
	}
}

	
	
