package idVerification;

public class Versions {

	private int id_no;
	private String Name;
	private int salary;
	private String place;
	private int age;
	
	public Versions( int id_no,String Name) {
		this.id_no=id_no;
		this.Name=Name;
	}
	public Versions( int id_no,String Name,int salary,String place,int age) {
		this(id_no,Name);
		this.salary=salary;
		this.place=place;
		this.age=age;
		}
	public void  printVersion( ) {
		System.out.println(id_no);
		System.out.println(Name);
		System.out.println(salary);
		System.out.println(place);
		System.out.println(age);
	}
}
