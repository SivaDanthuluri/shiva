package day4;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {10, 30, 20, 20, 10, 30, 50, 10, 30};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr2 = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1])
				{
					arr2[j++]=arr[i];
				}
		}
		arr2[j++] = arr[arr.length-1];
		System.out.println(Arrays.toString(arr2));
		for (int i = 0; i < j; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}
}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	