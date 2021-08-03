package tasks;

import java.util.Arrays;

public class NthMax {

	public static void main(String[] args) {
		
		int a[]= {13,45,45,56,78,78,23,14,56};
		
	int b[]= new int[a.length];
	int j=0;
	Arrays.sort(a);
	for (int i = 0; i < a.length-1; i++) {
		if(a[i]!=a[i+1])
		{
			b[j++]=a[i];
		}
	}
	b[j++]=a[a.length-1];
	for (int i = 0; i < j; i++) {
		System.out.print(b[i]+ " ");
	}
	}
}


/*	System.out.println(Arrays.toString(a));
	int j=0;
	for (int i = 0; i < a.length-1; i++) {
		if(a[i]!=a[i+1])
		{
			b[j++]=a[i];
		}
	}
		b[j++]=a[a.length-1];
		for (int  i = 0; i < j; i++) {
			System.out.print(b[i]+" ");
			
			
		}
		int n=2;
		System.out.println();
		System.out.println(b[n]); 
	
	}
	}
*/