package com.logical.programming;

import java.util.Scanner;

public class SteppingNumber {
	void isStepNum(int m,int n) {
	for(int i=m;i<=n;i++) {
		int a=i%10;
		int q=i/10;
		int b=q%10;
		q=q/10;
		int c=q%10;
		int d=q/10;
		/*System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);*/
		if((a-d==1)||(a-d==-1)) {
			if((a-b==1)||(a-b==-1)){
				if((c-b==1)||(c-b==-1)){
					if((c-d==1)||(c-d==-1)){
						System.out.println(i);
					}
				}	
			}
		}
	}
}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lower bound");
		int start=scan.nextInt();
		System.out.println("Enter Upper bound");
		int end=scan.nextInt();
		SteppingNumber number=new SteppingNumber();
		number.isStepNum(start,end);
}
}
