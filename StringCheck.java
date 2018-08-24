package com;
import java.util.Scanner;
public class StringCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str =sc.next();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if((ch[i]>=65 && ch[i]<=90) ||(ch[i] >=97 && ch[i]<=122) )
			{
				System.out.println("Alphabet");	
			}
			else if(ch[i]>=48 && ch[i]<=57)
			{
				System.out.println("digit");	
			}
			else
			{
				System.out.println("invalid");	
			}
		}
		sc.close();
	}

}
