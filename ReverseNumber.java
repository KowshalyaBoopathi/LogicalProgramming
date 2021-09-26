package com.logical.programming;

import java.util.*;

public class ReverseNumber {
	
	void reverse(int n) {int rev=0,rem;
		/*if(n<10) {
			System.out.print(n);
		}
		else {
			System.out.print(n%10);
			reverse(n/10);
		}*/
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.print(rev);
	}
	public static void main(String args[]) {
		System.out.println("Enter any number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		ReverseNumber number=new ReverseNumber();
		number.reverse(num);
	}
}
