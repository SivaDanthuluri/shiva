package employee_ids;
 
 
public class Ver {
	private int id;
	private String name;
	private int age;
	private String place;
	

	public Ver(int id, String name,int age,String place) {
	 
	 this.id=id;
	 this.name=name;
	 this.age=age;
	 this.place=place;
	}
	public void printVer() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(place);
 }
}
