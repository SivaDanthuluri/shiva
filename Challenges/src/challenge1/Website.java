package challenge1;

public class Website {

	public static void main(String[] args) {
		String s="https://en.wikipedia.org/wiki/Main_Page";
		
		int start=s.indexOf("/");
		int end=s.lastIndexOf(".");
	//Domain name
		System.out.println(s.substring(start+2,end+4));

	}
	
}
