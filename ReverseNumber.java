package com.logical.programming;

import java.util.*;

public class ReverseNumber {
	
	void reversed(int number) {
		int rev=0;
		while(number!=0) {
			int remainder=number%10;
			rev=rev*10+remainder;
			number=number/10;
		}
		System.out.println(rev);	
	}
	
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number ");
		int number=scan.nextInt();
		ReverseNumber rNumber=new ReverseNumber();
		rNumber.reversed(number);	
	}

}
