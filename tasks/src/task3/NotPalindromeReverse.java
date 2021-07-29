package task3;

public class NotPalindromeReverse {

	public static void main(String[] args) {
		System.out.println(notPalindromeReverse("hello good morning axa hope we are happy"));

	}
	public static String notPalindromeReverse(String s)
	{
		String a[]=s.split(" ");
		StringBuilder b= new StringBuilder();
		StringBuilder c= new StringBuilder();
		for(int w=0;w<a.length;w++)
		{
			b= new StringBuilder(a[w]);
			
			if(a[w].equals(b.reverse().toString()))
			{
				 c.append(a[w]).append(" ");
			}
			else
			{
				
				
				 c.append(b).append(" ");
			}
		}
		return c.toString().trim();
	}

}
