package challenge_2;

public class SecuredorNot {
	public static void main(String[] args) {
		String s="https://en.wikipedia.org/wiki/Main_Page";
		String secure="https";
		if(secure.contentEquals(s.substring(0,5)))
			System.out.println("Secure");
		else
			System.out.println("Not Secure");
}
}