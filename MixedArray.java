package com.logical.programming;

public class MixedArray {
	
	public void arrangeArray(char array[],int size) {
		int posRed = 0;
		int posBlue = size - 1;
		for (int i = 0; i < posBlue;) {
			if (array[i] == 'R') {
				swap(array, i, posRed);
				posRed++;
				i++;
			} 
			else if (array[i] == 'B') {
				swap(array, i, posBlue);
				posBlue--;
			} 
			else {
				i++;
			}
		}

		for (char i: array) {
		System.out.println(i);
		}
	}


	private static void swap(char[] array, int a, int b) {
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void main (String[] args)
	{
		char array[] = {'R', 'G', 'B', 'G', 'B', 'G', 'R'};
		int size = array.length;

		MixedArray sub = new MixedArray();
		sub.arrangeArray(array, size);
	}
}

