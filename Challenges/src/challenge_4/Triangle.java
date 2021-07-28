package challenge_4;
import java.lang.*;


public class Triangle {

	public static void main(String[] args) {
		System.out.println(Triangle(3,4));

	}
	
	public static double Triangle(int a,int b)
	{
		double c= (a*a)+(b*b);
		double d= Math.sqrt(c);
		return d;
	}
	

}
