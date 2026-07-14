package com.coforge.day3;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem=0;
		int rev=0;
		int copy=n;
		while(copy>0)
		{
			rem=copy%10;
			rev=(10*rev)+rem;
			copy=copy/10;
		}
		
		System.out.println("Reversed Integer of "+n+" is : " + rev);
		
		sc.close();
	}

}
