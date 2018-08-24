package com;
 import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the anything to check");
		char ch='$';
		if(ch>='a' && ch<='z')
		{
			System.out.println("Alphabet");
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("digit");
		}
		else
		{
			System.out.println("Sorry you entered the wrong things like special character :");
		}
		sc.close();

	}

}
