package idVerifications;

public class DrivingLicence {

	public static void main(String[] args) {
		/*String s= "AP03520190035580";*/
		System.out.println(isDrivingLicence("AP03520190035692"));
	}
	public static boolean isDrivingLicence(String s) {
		boolean p;
		return p= s.matches("[A-Z]{2}[0-9]{14}");
	}
}
