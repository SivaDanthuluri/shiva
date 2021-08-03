package idVerifications;

public class CheckVoterId {

	public static void main(String[] args) {
		System.out.println(CheckVoterId("BGS2579436"));

	}
	public static boolean CheckVoterId(String s) {
	boolean v;
	return v=s.matches("[A-Z]{3}[0-9]{7}");
}
}