package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		
		//1. make an array of 5 Strings
		String[] strings= {"yt","yet","yeet","yeeet","yeeeet",};
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2]="yote";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<strings.length;i++) {
			System.out.println(strings[i]);
		}
		
		//6. make an array of 50 integers
		int[] integers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		int minValue=0;
		int maxValue = 0;
		boolean ranAlready = false;
		for(int i=0; i<50;i++) {
			Random ran = new Random();
			int g = ran.nextInt(701);
			integers[i]= g;
if(ranAlready == false) {
	minValue = integers[0];
	maxValue = integers[0];
	ranAlready = true;
}
			
			if(integers[i]<minValue) {
				minValue=integers[i];
			}
			
			if(integers[i]>maxValue) {
				maxValue=integers[i];
			}
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		
		System.out.println("        "+minValue);
		
		//9 print the entire array to see if step 8 was correct
		for(int i=0; i<50;i++) {
		System.out.println(integers[i]);
		}
		//10. print the largest number in the array.
		System.out.println("        "+maxValue);
	}
}
