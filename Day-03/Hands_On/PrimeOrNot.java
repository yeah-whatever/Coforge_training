package com.coforge.day3;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int n = sc.nextInt();
		
		for (int i = 2; i*i<=n; i++) {
			if (n % i == 0)
			{
				flag=false;
				break;
			}
				
		}
		
		if (flag)
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is not a Prime Number");
		
		sc.close();
	}

}
