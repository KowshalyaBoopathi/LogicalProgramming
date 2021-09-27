package com.logical.programming;

import java.io.*;
import java.util.*;

public class SubStringPrinting {

	/*public static final int CHARACTER_RANGE = 128;
	 
    public static String Substring(String str)
    {
        if (str == null || str.length() == 0) {
            return str;
        }
         boolean[] now = new boolean[CHARACTER_RANGE];
 
        int begin = 0, end = 0;
 
        for (int low = 0, high = 0; high < str.length(); high++)
        {
            if (now[str.charAt(high)])
            {
                while (str.charAt(low) != str.charAt(high))
                {
                    now[str.charAt(low)] = false;
                    low++;
                }
                low++;        
            }
            else {

                now[str.charAt(high)] = true;
 
                if (end - begin < high - low)
                {
                    begin = low;
                    end = high;
                }
            }
        }
         return str.substring(begin, end + 1);
    }*/
	
    /*public void Substring(StringBuffer str) {
    	int size=str.length();
    	System.out.println(size);
    	
    }

 
    public static void main(String[] args)
    {
        StringBuffer str =new StringBuffer("However Everyday is a Day");
        //StringBuffer str =new StringBuffer("Happy Holi!");
        
        SubStringPrinting sub=new SubStringPrinting();
        sub.Substring(str);
     }*/
	
	// Java implementation to print the longest common substring

		/* function to find and print the longest common
		substring of X[0..m-1] and Y[0..n-1] */
		static void printSubStr(String X, String Y, int m, int n)
		{
			int[][] LCSuff = new int[m + 1][n + 1];

			int len = 0;

			int row = 0, col = 0;

			for (int i = 0; i <= m; i++) {
				for (int j = 0; j <= n; j++) {
					if (i == 0 || j == 0)
						LCSuff[i][j] = 0;

					else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
						LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1;
						if (len < LCSuff[i][j]) {
							len = LCSuff[i][j];
							row = i;
							col = j;
						}
					}
					else
						LCSuff[i][j] = 0;
				}
			}

			if (len == 0) {
				System.out.println("No Common Substring");
				return;
			}
			String resultStr = "";

			while (LCSuff[row][col] != 0) {
				resultStr = X.charAt(row - 1) + resultStr; 
				--len;

				row--;
				col--;
			}

			System.out.println(resultStr);
		}
		
		public static String SubStringg (String str, int n)
	    {
	       for (int i = 0; i < n; i++)
	           for (int j = i+1; j <= n; j++)
	
	                System.out.println(str.substring(i, j));
		return str;
	    }
		
		public static void main(String args[])
		{
			String X = "However Everyday is a Day.";
						
			int m = X.length();
			
			String Y=SubStringg(X,m);

			int n = Y.length();

			printSubStr(X, Y, m, n);
		}
}
