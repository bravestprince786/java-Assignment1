package com;
import java.util.*;
public class Amount {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Amount");
		float f=sc.nextFloat();
		float bill=20000f;
		float f_bill1 = 0f;
		float f_bill2=0f;
		if(f>=bill)
		{
			 f_bill1=f-((f*10)/100);
			 System.out.println("Discounted Amount :"+f_bill1);
		}
		else if((f_bill1>5000) && (f_bill1<20000))
		{
			 f_bill2=f_bill1-((f_bill1*5)/100);
			 System.out.println("Discounted Amount :"+f_bill2);
		}
		else if(f_bill2<5000)
		{
			System.out.println("No Discount");
		}
		sc.close();
	}
}
