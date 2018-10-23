package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] boi = {"treyway", "scumgang", "6IX9INE", "Lil Pump", "Esketit"};
		//2. print the third element in the array
		System.out.println(boi[2]);
		//3. set the third element to a different value
		boi[2] = "billy";
		//4. print the third element again
		System.out.println(boi[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(boi[i]);
		}
		
		//6. make an array of 50 integers
		int[] dank = new int[50];
		int smallest = dank[0];

		//7. use a for loop to make every value of the integer array a random number
		for (int j = 1; j < dank.length; j++) {
			Random meme = new Random();
			dank[j] = meme.nextInt(50);
			System.out.println(dank[j]);
			
			}
		//8. without printing the entire array, print only the smallest number in the array
		 
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
