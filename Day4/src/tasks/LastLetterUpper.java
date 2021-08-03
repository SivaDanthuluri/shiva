package tasks;

public class LastLetterUpper {

	public static void main(String[] args) {
		System.out.println(converLastLetterToUpper("hello good morning hope we are happy"));

	}
	
	public static String converLastLetterToUpper(String s) {
	String a[]= s.split(" ");
	StringBuilder sb= new StringBuilder();
	for(int w=0; w<a.length;w++ ) {
		int i=a[w].length()-1;
	sb.append(a[w].substring(0,i)).append(Character.toUpperCase(a[w].charAt(i))).append(" ");
	
	}
	return sb.toString();
	}
}
