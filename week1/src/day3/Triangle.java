package day3;
import java.lang.*;


public class Triangle {

	public static void main(String[] args) {
		
		System.out.println("Third side c : "+Triangle(3,4));

	}
	
	public static double Triangle(int a,int b)
	{
		/*  double c= Math.pow(a,2)+Math.pow(b,2);*/
		double c= (a*a)+(b*b);
		 
		double d= Math.sqrt(c);
		return d;
	}
	

}
