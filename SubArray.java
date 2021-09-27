package com.logical.programming;

class SubArray {
	
		public void findSubArray(int array[], int size)
		{
			int sum=0;
			int maxsize=-1, startindex=0, endindex=0;

			for (int i=0; i<size-1; i++) {
				
				if (array[i]==0)
					sum=-1;
				else
					sum=1;

				for (int j=i+1; j<size; j++) {
					if (array[j]==0) 
						sum=sum+ -1;
					else 
						sum=sum+ 1;

					if (sum==0 && maxsize<j-i+1) {
						maxsize=j-i+1;
						startindex=i;
					}
				}
			}
			
			endindex=startindex+maxsize-1;
			
			if (maxsize==-1)
				System.out.println("No sub-array found.");
			else
				System.out.println(startindex+" to "+endindex);
		}

		public static void main (String[] args)
		{
			int array[] = { 1, 0, 1, 1, 1, 0, 0};
			int size = array.length;

			SubArray sub = new SubArray();
			sub.findSubArray(array, size);
		}
}



























/*int maxLen(int arr[], int n)
{

	HashMap<Integer, Integer> hM
		= new HashMap<Integer, Integer>();

	int sum = 0;

	int max_len = 0;
	int ending_index = -1;
	int start_index = 0;

	for (int i = 0; i < n; i++) {
		arr[i] = (arr[i] == 0) ? -1 : 1;
	}

	for (int i = 0; i < n; i++) {

		sum += arr[i];

		if (sum == 0) {
			max_len = i + 1;
			ending_index = i;
		}

		if (hM.containsKey(sum)) {
			if (max_len < i - hM.get(sum)) {
				max_len = i - hM.get(sum);
				ending_index = i;
			}
		}
		else 
			hM.put(sum, i);
	}

	for (int i = 0; i < n; i++) {
		arr[i] = (arr[i] == -1) ? 0 : 1;
	}

	int end = ending_index - max_len + 1;
	System.out.println(end + " to " + ending_index);

	return max_len;
}

public static void main(String[] args)
{
	SubArray sub = new SubArray();
	int arr[] = {  1, 1, 1 };
	int n = arr.length;

	sub.maxLen(arr, n);
}*/


