package idVerifications;

public class PassportNoYesOrNo {

	public static void main(String[] args) {
		System.out.println(passportOrNot("H1633445"));
	}
	public static boolean passportOrNot(String s) {
		boolean p;
		return p= s.matches("[A-Z]{1}[0-9]{7}");
	}
}
