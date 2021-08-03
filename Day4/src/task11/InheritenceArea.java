package task11;

public class InheritenceArea {

int length,breath,side,heigth;
	
	

	public  void area(int length,int breath)
	{
		
		System.out.println("Area of Rectangle :"+length*breath);
	}
	
	public  void area(int side)
	{
		
		System.out.println("Area of square :"+side*side);
	}
	public  void area(int length,int breath,int heigth)
	{
		
		System.out.println("Area of Trapezium :"+((length*breath)/2)*heigth);
	}

}
	class Rectangle extends InheritenceArea{}
	class Square extends InheritenceArea{}
	class Trapezium extends InheritenceArea{}
	
	class Area{
		
	public static void main(String[] args)
	{
		Rectangle object1= new Rectangle();
		object1.area(2,5);
		Square object2=new Square();
		object2.area(5);
		Trapezium object3= new Trapezium();
		
		object3.area(2,5,4);
	}
}
