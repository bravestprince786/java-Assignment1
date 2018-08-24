package com;
import java.util.Scanner;
public class First_last {
	public static int first_num(int n)
	{
		while(n>=10)
		{
			 n/=10;
			
		}
		return n;
	}
	public static int last_num(int n)
	{
		
		return(n%10);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit  :");
		int num=sc.nextInt();
		System.out.println(first_num(num)+" "+last_num(num));
		sc.close();
	}

	
}
