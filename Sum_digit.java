package com;
import java.util.Scanner;
public class Sum_digit {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		int r;
		int sum=0;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum+=r;
		}
		System.out.println("Sum of the digit :"+sum);
		sc.close();
	}

}
