package com.logical.programming;

import java.util.*;

public class SteppingNumber {
	
	private void steppingNo (int start, int end) {
	    int count = 0;
	    for (int i=start; i<= end;i++) {
	        if (isStepping(start)) {
	        	int step=start;
	        	int digit=digits(start);
	        	int remainder=step%10;
	        	int quotient=(int) (step/(Math.pow(10,(digit-1))));
	        	if(Math.abs(remainder-quotient)==1) {
	            System.out.println(start);
		        count++;
 		        }
	        	if(start>=0&&start<=9) {
	        		System.out.println(start);
	        	}
	        }
	        start++;
	    }
	    if(count==0) {
	    	System.out.println("No stepping numbers for this range");
	    }
	}
	
	private int digits(int digit) {
		int count=0;
		while(digit!=0) {
			digit=digit/10;
			count++;
		}
		return count;
	}
	    
	private boolean isStepping(int number) {
	    if (number >= 0 && number <= 9) 
	    	return true;
	    
	    while (number >= 10) {
	        if (Math.abs(number % 10 - (number / 10) % 10) != 1) { 
	            return false;
	        }
	        number = number / 10;
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lower bound");
		int start=scan.nextInt();
		System.out.println("Enter Upper bound");
		int end=scan.nextInt();
		SteppingNumber number=new SteppingNumber();
		number.steppingNo(start,end);
	}
}
