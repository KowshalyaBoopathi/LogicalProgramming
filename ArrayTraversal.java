package com.logical.programming;

public class ArrayTraversal {
	
	private void traversedArray(int array[], int n)
    {
        int next, i, j;
        for (i=0; i<n; i++)
        {
            next = -1;
            for (j = i+1; j<n; j++)
            {
                if(array[i] < array[j])
                {	
                	next = array[j];
                	//isNext(next);
                    break;
                }
            }
            System.out.println(next);
        }
    }
	
	/*private boolean isNext(int next) {
        int array[]= {2, 4, 8, 90, 77, 54};
        for(int i=0;i<array.length;i++) {
		if(next>array[i])
		return false;
        }
		return true;
	}*/
      
    public static void main(String args[])
    {
        int array[]= {2, -1, 0, -1, 3};
        int n = array.length;
        ArrayTraversal arrayTrav=new ArrayTraversal();
        arrayTrav.traversedArray(array, n);
    }
}
