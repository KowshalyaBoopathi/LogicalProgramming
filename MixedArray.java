package com.logical.programming;

public class MixedArray {
	
	/*public void arrangeArray(char array[],int size) {
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
	}*/
	
	public void arrangeArray(char array[],int size) {
		int cred=0,cblue=0,cgreen=0,count=0,i=0;
		for(i=0;i<size;i++) {
		switch(array[i]) {
		case 'R':
			cred++;
			break;
		case 'G':
			cgreen++;
			break;
		case 'B':
			cblue++;
			break;
		}
	}
		System.out.println(cred+""+cblue+""+cgreen);
			while(count<size) {for(i=0;i<size;i++) {
				char ch=array[i];
				if(ch=='B') {
					print(ch,cblue);
					count-=cblue;
					
				}
				else if(ch=='G') {
					print(ch,cgreen);
					count-=cgreen;
				}
				else if(ch=='R') {
					print(ch,cred);
					count-=cred;
				}
			}
			}
}
	void print(char ch,int n) {
		while(n!=0) {
			System.out.println(ch);
			n--;
		}
	}
	
	
	public static void main (String[] args)
	{
		//char array[] = {'R', 'G', 'B', 'G', 'B', 'G', 'R'};
		char array[] = {'B', 'G', 'B', 'R', 'G', 'R', 'B', 'G', 'R', 'R', 'B'};
		int size = array.length;

		MixedArray sub = new MixedArray();
		sub.arrangeArray(array, size);
	}
}

