package com.logical.programming;

import java.util.*;

public class TrapNumbers {
	
	int yCheck(int y) {
		if(y<3)
			y=3;
		return y;
	}
	
	int zCheck(int z) {
		if(z>=10)
			z=sumOfDigits(z);
		return z;
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
	
	void trapSequence(int n1,int n2,int y) {
		
		int count=0;
		
		for(int x=n1;x<=n2;x++) {
			
			int z=sumOfDigits(x);
			z=zCheck(z);

			if((x==y) || (z==y)) {
				y=y+2;
				System.out.println(x);
				count=count+1;
			}	
			
			else if((x%y==0)||(y%x==0)||(z%y==0)||(y%z==0)) {
				y=y+2;
				System.out.println(x);
				count=count+1;
			}
			
			else {
				y=y-1;
				y=yCheck(y);
			}
			
		}
		if(count==0)
			System.out.println("NONE");
		
	}
	
	/*int[] toArray(int n1, int n2) {
		int n=n2-n1+1;
		int [] array=new int [n];
		for(int i=0;i<n;i++) {
			array[i]=n1++;
		}
		/*for(int i=0;i<n;i++)
			System.out.println(array[i]);*/
		/*return array;
		}*/
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N1 value");
		int n1=scan.nextInt();
		System.out.println("Enter N2 value");
		int n2=scan.nextInt();
		System.out.println("Enter y value");
		int y=scan.nextInt();
		TrapNumbers obj =new TrapNumbers();
		obj.trapSequence(n1,n2,y);
	}
}

