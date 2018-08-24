package com;
import java.util.*;
import java.lang.Math;
public class Series {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number for the series :");
		int num=sc.nextInt();
		System.out.println("Enter the power range :");
		int power=sc.nextInt();
		int seriesSum=0;
		for(int i=1;i<=power;i++)
		{
			seriesSum+=Math.pow(num, i);
		}
		System.out.println(seriesSum);
		sc.close();
	}

}
