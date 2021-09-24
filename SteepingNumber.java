package com.logical.programming;

import java.util.Scanner;

public class SteepingNumber {
	
	/*void isSteppingNumber(int m,int n) {
	for(int i=m;i<=n;i++) {
		int a=i%10;
		int q=i/10;
		int b=q%10;
		q=q/10;
		int c=q%10;
		int d=q/10;
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
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
	//System.out.println(m+" "+n);
}*/
	
	
	void display(int m,int n) {
		for(int i=m;i<=n;i++) {
			if(isSteppingNumber(i)) {
				System.out.println(i);
			}
		}
	}
	
	public boolean isSteppingNumber(int n) {
		int QuoNumber=-1;
		while(n>0) {
			int remNumber=n%10;
			
			if(QuoNumber!=-1) {
				if(Math.abs(QuoNumber-remNumber)!=1) {
					return false;
				}
			}
			n=n/10;
			QuoNumber=remNumber;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lower bound");
		int start=scan.nextInt();
		System.out.println("Enter Upper bound");
		int end=scan.nextInt();
		SteepingNumber number=new SteepingNumber();
		number.display(start,end);
}

}
