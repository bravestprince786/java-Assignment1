package com;
import java.util.Scanner;
public class Switch1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		if(num%7==0)
		{
			System.out.println("Number which is divisible by 7 :" +num);
		}
		else if(num%2==0)
		{
			System.out.println("number is even :"+num);
		}
		else
		{
			System.out.println("number is odd :"+num);
		}
		sc.close();

	}

}
