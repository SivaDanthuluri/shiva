package task9;

import java.util.Arrays;

public class FirstLastSameRemove {

	public static void main(String[] args) {
		int a[]= {101,252,869,748,23,11,58,696,454,86,95,74};
		
		int b[]=new int[a.length];
		int j=0;
	
		for (int i = 0; i < a.length; i++) {
			
			String s=String.valueOf(a[i]);
			String sb[]=s.split("");
			int l=sb.length;
			
				if(String.valueOf(sb[0]).equals(String.valueOf(sb[l-1])))
				{
					a[i]=a[i];
				}
			
				else
			{
				b[j++]=a[i];
			}
			
		}
		for(int i=0;i<j;i++)
		{
			
			System.out.print(b[i] +" ");
		}

	}

}
