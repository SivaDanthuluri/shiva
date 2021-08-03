package day4;

import java.util.Arrays;

public class Palindro {

	public static void main(String[] args) {
		int a[]= {23,343,565,7,8,9,90,45};
		StringBuilder b= new StringBuilder();
		for(int i=0;i<a.length;i++)
			
		{
			b=new StringBuilder(String.valueOf(a[i]));
			
			if(String.valueOf(a[i]).equals(b.reverse().toString()))
			{
			System.out.println(a[i]);
			}
		}
		

	}

}
