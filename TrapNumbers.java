package com.logical.programming;

import java.util.*;

public class TrapNumbers {
	
	boolean traps(int n1, int n2, int y) {
			
			for(int i=n1;i<=n2;i++) {
				int z=sumOfDigits(i);
				if(i==y) {
					return true;
				}
				if(i==z) {
					return true;
				}
			}
		return false;
	}
	
	int sumOfDigits(int number) {
		int sum=0;
		while(number!=0) {
			int remainder=number%10;
			sum=sum+remainder;
			number=number/10;
		}
		return sum;
	}
	
	/*boolean validate(int n1, int n2, int y) {	
		if(y>=3)
			return true;
		else if(n2>=0&&n1>=0)
			return true;
		else
			return false;
	}*/
	void trapSequence(int n1,int n2,int y) {
		for(int i=n1;i<=n2;i++) {
			if(traps(n1,n2,y)) {
				System.out.println(n1);
				y=y+2;
			}
			else if(y>=3){
				y--;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N1 value");
		int n1=scan.nextInt();
		System.out.println("Enter N2 value");
		int n2=scan.nextInt();
		System.out.println("Enter y value");
		int y=scan.nextInt();
		TrapNumbers obj =new TrapNumbers();
		obj.trapSequence(n1, n2, y);
	}

}
