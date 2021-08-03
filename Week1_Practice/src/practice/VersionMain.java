package practice;

public class VersionMain {

	public static void main(String[] args) {
		Versions V1= new Versions(10,"name");
		V1.printVersion();
		Versions V2= new Versions(101,"nname",15000,"India",23);
		
		V2.printVersion();
}
}
